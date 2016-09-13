import java.awt.*;
import java.awt.geom.*;
import java.awt.datatransfer.*;
import java.io.Serializable;
import java.util.StringTokenizer;
/**
 * Данный класс представляет рисунок, составленный из произвольного числа 
 * “полилиний”. Каждая полилиния представляет собой набор соединенных между 
 * собой отрезков. Рисунок создается при помощи серии вызовов методов 
 * moveto() и lineto(). moveto() указывает начальную точку новой полилинии,
 * а lineto() добавляет к концу текущей полилинии новую точку.
 *
 * Данный класс реализует интерфейс Shape, это значит, что он может быть 
 * отображен с помощью программного графического интерфейса Java2D. 
 * 
 * Кроме этого, он реализует интерфейс Transferable, то есть он легко может
 * быть использован в операциях вырезанияявставки и перетаскивания. 
 * Он определяет пользовательский формат DataFlavorscribbleDataFlavor, 
 * который передает объекты Scribble в виде Javaaобъектов. Однако он также 
 * поддерживает механизмы вырезанияявставки и перетаскивания, основанные 
 * на переносимом строковом представлении фрагмента. 
 * Методы toString() и parse() записывают и читают этот строковый формат.
 **/
public class Scribble implements Shape, Transferable, Serializable, Cloneable 
{
	protected double[] points = new double[64]; // Данные рисунка
	protected int numPoints = 0;                // Текущее количество точек
	double maxX = Double.NEGATIVE_INFINITY;     // Ограничивающий прямоугольник 
	double maxY = Double.NEGATIVE_INFINITY;
	double minX = Double.POSITIVE_INFINITY;
	double minY = Double.POSITIVE_INFINITY;
	/** 
	 * Начинаем новый многоугольник с координатами (x,y). 
	 * Обратите внимание на использование константы Double.NaN в массиве точек 
	 * для отметки начала новой полилинии.
	 **/
	public void moveto(double x, double y) 
	{
		if (numPoints + 3 > points.length) reallocate();
		// Отмечаем ее как начало новой линии
		points[numPoints++] = Double.NaN;
		// Окончание этого метода просто похоже на lineto();
		lineto(x, y);
	}
	/**
	 * Добавляем к концу текущей полилинии точку (x,y)
	 **/
	public void lineto(double x, double y)
	{
		if (numPoints + 2 > points.length) reallocate();
		points[numPoints++] = x;
		points[numPoints++] = y;
		// Смотрим, не выходит ли точка за пределы ограничивающего прямоугольника
		if (x > maxX) maxX = x;
		if (x < minX) minX = x;
		if (y > maxY) maxY = y;
		if (y < minY) minY = y;
	}
	/**
	 * Добавляем рисунок (Scribble) “s” к данному рисунку Scribble
	 **/
	public void append(Scribble s) 
	{
		int n = numPoints + s.numPoints;
		double[] newpoints = new double[n];
		System.arraycopy(points, 0, newpoints, 0, numPoints);
		System.arraycopy(s.points, 0, newpoints, numPoints, s.numPoints);
		points = newpoints;
		numPoints = n;
		minX = Math.min(minX, s.minX);
		maxX = Math.max(maxX, s.maxX);
		minY = Math.min(minY, s.minY);
		maxY = Math.max(maxY, s.maxY);
	}
	/**
	 * Преобразуем координаты всех точек рисунка Scribble с помощью x,y
	 **/
	public void translate(double x, double y) 
	{
		for(int i = 0; i < numPoints; i++) {
			if (Double.isNaN(points[i])) continue;
			points[i++] += x;
			points[i] += y;
		}
		minX += x; maxX += x;
		minY += y; maxY += y;
	}
	/** Внутренний метод для выделения дополнительного места в массиве данных */
	protected void reallocate() 
	{
		double[] newpoints = new double[points.length * 2];
		System.arraycopy(points, 0, newpoints, 0, numPoints);
		points = newpoints;
	}
	/** Копируем объект Scribble и его внутренний массив данных */
	public Object clone() 
	{
		try {
			Scribble s = (Scribble) super.clone(); // Делаем копию всех полей
			s.points = (double[]) points.clone();  // Копируем весь массив
			return s;
		}
		catch (CloneNotSupportedException e) {   // Этого никогда не должно 
			// случиться
			return this;
		}
	}

	/** Конвертируем данные рисунка в текстовый формат */
	public String toString() 
	{
		StringBuffer b = new StringBuffer();
		for(int i = 0; i < numPoints; i++) {
			if (Double.isNaN(points[i])) {
				b.append("m ");
			}
			else {
				b.append(points[i]);
				b.append(' ');
			}
		}
		return b.toString();
	}
	/** 
	 * Создаем новый объект Scribble и инициализируем его путем
	 * разбора строки, содержащей координаты в формате, 
	 * сгенерированном методом toString()
	 **/
	public static Scribble parse(String s) throws NumberFormatException 
	{
		StringTokenizer st = new StringTokenizer(s);
		Scribble scribble = new Scribble();
		while(st.hasMoreTokens()) {
			String t = st.nextToken();
			if (t.charAt(0) == 'm') {
				scribble.moveto(Double.parseDouble(st.nextToken()),
						Double.parseDouble(st.nextToken()));
			}
			else {
				scribble.lineto(Double.parseDouble(t),
						Double.parseDouble(st.nextToken()));
			}
		}
		return scribble;
	}

	// ===== Следующие методы реализуют интерфейс Shape ===== 

	/** Возвращаем ограничивающий прямоугольник объекта Shape */
	public Rectangle getBounds() 
	{
		return new Rectangle((int)(minX-0.5f), (int)(minY-0.5f),
				(int)(maxX+minX+0.5f), (int)(maxY+minY+0.5f));
	}

	/** Возвращаемый ограничивающий прямоугольник объекта Shape */
	public Rectangle2D getBounds2D() {
		return new Rectangle2D.Double(minX, minY, maxX-minX, maxY-minY);
	}

	/** Наша фигура является незамкнутой кривой, поэтому она 
      не может ничего содержать */
	public boolean contains(Point2D p) { return false; }
	public boolean contains(Rectangle2D r) { return false; }
	public boolean contains(double x, double y) { return false; } 
	public boolean contains(double x, double y, double w, double h) {
		return false;
	}
	/**
	 * Определяем, пересекается ли рисунок с указанным прямоугольником, 
	 * проверяя по отдельности каждый отрезок линии
	 **/
	public boolean intersects(Rectangle2D r) {
		if (numPoints < 4) return false;
		int i = 0;
		double x1, y1, x2 = 0.0, y2 = 0.0;
		while(i < numPoints) {
			if (Double.isNaN(points[i])) { // Если мы начинаем новую линию
				i++;        //  Пропускаем NaN
				x2 = points[i++];
				y2 = points[i++];
			}
			else {
				x1 = x2;
				y1 = y2;
				x2 = points[i++];
				y2 = points[i++];
				if (r.intersectsLine(x1, y1, x2, y2)) return true;
			}
		}
		return false;
	}
	/** Проверка на пересечение с помощью вызова предыдущего метода  */
	public boolean intersects(double x, double y, double w, double h){
		return intersects(new Rectangle2D.Double(x,y,w,h));
	}
	/**
	 * Возвращаем объект PathIterator, сообщающий Java2D, 
	 * как нужно изображать данный рисунок
	 **/
	public PathIterator getPathIterator(AffineTransform at) {
		return new ScribbleIterator(at);
	}

	/**
	 * Возвращаем PathIterator, не содержащий кривых. Наш никогда не содержит.
	 **/
	public PathIterator getPathIterator(AffineTransform at, double flatness) {
		return getPathIterator(at);
	}
	/**
	 * Этот внутренний класс реализует интерфейс PathIterator для описания 
	 * формы рисунка. Такие, как Scribble, состоят из произвольного
	 * количества точек и линий, мы просто возвращаем их координаты.
	 **/
	public class ScribbleIterator implements PathIterator {
		protected int i = 0;         // Позиция в массиве
		protected AffineTransform transform;
		public ScribbleIterator(AffineTransform transform) {
			this.transform = transform;
		}
		/** Как определить внутреннюю и внешнюю части этой формы */
		public int getWindingRule() { return PathIterator.WIND_NON_ZERO; }
		/** Достигли ли мы конца пути рисунка? */
		public boolean isDone() { return i >= numPoints; }
		/** Перемещаемся к следующему отрезку пути */
		public void next() {
			if (Double.isNaN(points[i])) i += 3;
			else i += 2;
		}
		/** 
		 * Получаем координаты текущей точки и линии в виде массива float
		 **/
		public int currentSegment(float[] coords) {
			int retval;
			if (Double.isNaN(points[i])) {    // Если это точка
				coords[0] = (float)points[i+1];
				coords[1] = (float)points[i+2];
				retval = SEG_MOVETO;
			}
			else {
				coords[0] = (float)points[i];
				coords[1] = (float)points[i+1];
				retval = SEG_LINETO;
			}
			// Если было задано преобразование, применяем его для всех координат
			if (transform != null) 
				transform.transform(coords, 0, coords, 0,1);
			return retval;
		}
		/** 
		 * Получаем координаты точек и линий в виде массива double
		 **/
		public int currentSegment(double[] coords) {
			int retval;
			if (Double.isNaN(points[i])) {
				coords[0] = points[i+1];
				coords[1] = points[i+2];
				retval = SEG_MOVETO;
			}
			else {
				coords[0] = points[i];
				coords[1] = points[i+1];
				retval = SEG_LINETO;
			}
			if (transform != null) transform.transform(coords, 0, coords, 0,1);
			return retval;
		}
	}

	//========== Следующие методы реализуют интерфейс Transferable ==========
	// Это пользовательский DataFlavor для объектов 
	// Scribble 
	public static DataFlavor scribbleDataFlavor = new DataFlavor(Scribble.class, "Scribble");
	// Это список форматов, с которыми мы умеем работать 
	public static DataFlavor[] supportedFlavors = {
			scribbleDataFlavor,
			DataFlavor.stringFlavor
	};
	/** Возвращаем форматы данных, или просто “форматы” (flavors), 
          которые мы умеем передавать */
	public DataFlavor[] getTransferDataFlavors() {
		return (DataFlavor[]) supportedFlavors.clone();
	}
	/** Проверяем, поддерживаем ли мы данный формат */
	public boolean isDataFlavorSupported(DataFlavor flavor) {
		return (flavor.equals(scribbleDataFlavor) ||
				flavor.equals(DataFlavor.stringFlavor));
	}
	/**
	 * Возвращаем данные рисунка в запрошенном формате или генерируем 
	 * исключение, если мы не поддерживаем запрошенный формат
	 **/
	public Object getTransferData(DataFlavor flavor)
			throws UnsupportedFlavorException
	{
		if (flavor.equals(scribbleDataFlavor)) { return this; }
		else if (flavor.equals(DataFlavor.stringFlavor)) { return toString(); }
		else throw new UnsupportedFlavorException(flavor);
	}
}
