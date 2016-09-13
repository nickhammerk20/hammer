import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.datatransfer.*; // Clipboard, Transferable, DataFlavor и др.
import java.awt.dnd.*;
import java.util.ArrayList;
/**
 * Этот компонент может работать в двух режимах. В режиме “рисование”
 * он позволяет чертить мышью линии. В режиме “перетаскивание” 
 * он позволяет пользователю перетаскивать мышью этот рисунок. 
 * Независимо от режима он может принимать рисунки, перетащенные 
 * из других приложений.
 **/
public class ScribbleDragAndDrop extends JComponent
implements DragGestureListener,  // Для распознавания начала перетаскивания 
DragSourceListener,   // Для обработки событий источника перетаскивания
DropTargetListener,   // Для обработки событий приемника перетаскивания
MouseListener,       // Для обработки щелчков мыши
MouseMotionListener  // Для обработки перетаскиваний мыши
{
	ArrayList scribbles = new ArrayList(); // Список рисуемых объектов Scribble
	Scribble currentScribble;              // Рисуемый объект
	Scribble beingDragged;                 // Перетаскиваемый объект
	DragSource dragSource;                 // Центральный объект перетаскивания
	boolean dragMode;                      // Рисуем или перетаскиваем?
	// Некоторые из используемых констант
	static final int LINEWIDTH = 3;
	static final BasicStroke linestyle = new BasicStroke(LINEWIDTH);
	static final Border normalBorder = new BevelBorder(BevelBorder.LOWERED);
	static final Border dropBorder = new BevelBorder(BevelBorder.RAISED);
	/** Конструктор: готовим все необходимое для перетаскивания */
	public ScribbleDragAndDrop() {
		// Используем принятую рамку, установленную по умолчанию.
		// Мы изменим ее в процессе перетаскивания.
		setBorder(normalBorder);
		// Регистрируем слушатели для обработки рисования
		addMouseListener(this);
		addMouseMotionListener(this);
		// Создаем DragSource и DragGestureRecognizer для прослушивания 
		// событий перетаскивания. DragGestureRecognizer будет сообщать 
		// объекту DragGestureListener о том, что пользователь делает
		// попытку перетащить объект.
		dragSource = DragSource.getDefaultDragSource();
		dragSource.createDefaultDragGestureRecognizer(
				this,                             // Какой компонент? 
				DnDConstants.ACTION_COPY_OR_MOVE, // Какой тип перетаскивания?
				this);                            // слушатель
		// Создаем и настраиваем DropTarget, который будет обрабатывать события 
		// по перетаскиванию и отпусканию объектов над этим компонентом
		// и будет посылать уведомления объекту DropTargetListener
		DropTarget dropTarget = new DropTarget(
				this,                    // Наблюдаемый компонент
				this);                   // Слушатель для отправки уведомлений
		this.setDropTarget(dropTarget);   // Сообщаем о нем компоненту
	}
	/**
	 * Компонент отображает себя путем отрисовки каждого объекта Scribble.
	 **/
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(linestyle);  // Устанавливаем широкие линии
		int numScribbles = scribbles.size();
		for(int i = 0; i < numScribbles; i++) {
			Scribble s = (Scribble)scribbles.get(i);
			g2.draw(s);             // Чертим рисунок
		}
	}
	public void setDragMode(boolean dragMode) {
		this.dragMode = dragMode;
	}
	public boolean getDragMode() { return dragMode; }
	/**
	 * Этот и следующие четыре метода относятся к интерфейсу MouseListener. 
	 * Если мы находимся в режиме “рисование”, этот метод обрабатывает события 
	 * нажатия кнопки мыши и начинает новый рисунок.
	 **/
	public void mousePressed(MouseEvent e) {
		if (dragMode) return;
		currentScribble = new Scribble();
		scribbles.add(currentScribble);
		currentScribble.moveto(e.getX(), e.getY());
	}
	public void mouseReleased(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	/**
	 * Этот метод и расположенный ниже метод mouseMoved() относятся к интерфейсу 
	 * MouseMotionListener. Если мы находимся в режиме “рисование”, этот метод
	 * добавляет к текущему фрагменту новую точку и запрашивает перерисовку.
	 **/
	public void mouseDragged(MouseEvent e) {
		if (dragMode) return;
		currentScribble.lineto(e.getX(), e.getY());
		repaint();
	}
	public void mouseMoved(MouseEvent e) {}
	/**
	 * Этот метод реализует интерфейс DragGestureListener. Он будет вызван
	 * тогда, когда DragGestureRecognizer решит, что пользователь начал
	 * операцию перетаскивания. Если мы не в режиме “рисование”, 
	 * данный метод попытается выяснить, какой объект Scribble перетаскивается,
	 * и инициализирует операцию перетаскивания для этого объекта.
	 **/
	public void dragGestureRecognized(DragGestureEvent e) {
		// Не перетаскиваем, если мы в режиме “рисование”
		if (!dragMode) return;
		// Выясняем, где началось перетаскивание
		MouseEvent inputEvent = (MouseEvent) e.getTriggerEvent();
		int x = inputEvent.getX();
		int y = inputEvent.getY();
		// Выясняем, над каким рисунком была нажата кнопка мыши, путем создания 
		// в этой точке небольшого прямоугольника и проверки на пересечение.
		// Проходим в цикле все рисунки.
		Rectangle r = new Rectangle (x-LINEWIDTH, y-LINEWIDTH, 
				LINEWIDTH*2, LINEWIDTH*2);
		int numScribbles = scribbles.size();
		for(int i = 0; i < numScribbles; i++) { // Проходим в цикле все рисунки
			Scribble s = (Scribble) scribbles.get(i);
			if (s.intersects(r)) { 
				// Пользователь начал перетаскивание на этом рисунке, 
				// поэтому начинаем перемещать его. Прежде всего, запоминаем, 
				// какой рисунок перетаскивается, чтобы позднее мы могли
				// удалить его (если это перемещение, а не копирование) 
				beingDragged = s;
				// Затем создаем копию, которая будет перетаскиваться
				Scribble dragScribble = (Scribble) s.clone();
				// Устанавливаем точку отсчета в место, 
				// где пользователь нажал кнопку мыши.
				dragScribble.translate(-x,  y); 
				// Устанавливаем форму указателя мыши в зависимости от типа
				// инициализированного пользователем перетаскивания
				Cursor cursor;
				switch(e.getDragAction()) {
				case DnDConstants.ACTION_COPY: 
					cursor = DragSource.DefaultCopyDrop;
					break;
				case DnDConstants.ACTION_MOVE:
					cursor = DragSource.DefaultMoveDrop;
					break;
				default: 
					return;  // Мы поддерживаем только перемещение и копирование
				}
				// Некоторые системы позволяют нам вместе с указателем перемещать
				// и изображение. Если это так, создаем изображение рисунка.
				if (dragSource.isDragImageSupported()) {
					Rectangle scribbleBox = dragScribble.getBounds();
					Image dragImage = this.createImage(scribbleBox.width,
							scribbleBox.height);
					Graphics2D g = (Graphics2D)dragImage.getGraphics();
					g.setColor(new Color(0,0,0,0)); // Прозрачный фон
					g.fillRect(0, 0, scribbleBox.width, scribbleBox.height);
					g.setColor(Color.black);
					g.setStroke(linestyle);
					g.translate(-scribbleBox.x, -scribbleBox.y);
					g.draw(dragScribble);
					Point hotspot = new Point(-scribbleBox.x, -scribbleBox.y);

					// Начинаем перетаскивание с использованием изображения.
					e.startDrag(cursor, dragImage, hotspot, dragScribble,this);
				}
				else {
					// Или начинаем перетаскивание без изображения
					e.startDrag(cursor, dragScribble,this);
				}
				// После того как мы начали перетаскивание одного
				// рисунка, прекращаем поиск.
				return;
			}
		}
	}
	/**
	 * Этот метод и следующие четыре неиспользуемых метода реализуют 
	 * интерфейс DragSourceListener. Метод dragDropEnd() вызывается тогда, 
	 * когда пользователь отпускает перетаскиваемый рисунок. 
	 * Если отпускание было выполнено успешно, и если пользователь 
	 * делал перемещение, а не копирование, мы удаляем перетащенный
	 * рисунок из списка отображаемых рисунков
	 **/
	public void dragDropEnd(DragSourceDropEvent e) {
		if (!e.getDropSuccess()) return;
		int action = e.getDropAction();
		if (action == DnDConstants.ACTION_MOVE) {
			scribbles.remove(beingDragged);
			beingDragged = null;
			repaint();
		}
	}
	// Эти методы также являются частью DragSourceListener.
	// Они вызываются в характерных точках процесса перетаскивания
	// и могут использоваться для реализации графических эффектов, 
	// таких как изменение вида указателя мыши или изображения.
	public void dragEnter(DragSourceDragEvent e) {}
	public void dragExit(DragSourceEvent e) {}
	public void dropActionChanged(DragSourceDragEvent e) {}
	public void dragOver(DragSourceDragEvent e) {}
	// Следующие пять методов реализуют интерфейс DropTargetListener
	/**
	 * Этот метод вызывается, когда пользователь перетаскивает что髸либо 
	 * над нами. Если мы понимаем тип данных перетаскиваемого объекта, то 
	 * вызываем acceptDrag(), чтобы сообщить системе, что мы можем его принять.
	 * Также мы меняем рамку для создания эффекта “перетаскивания под”,
	 * чтобы сигнализировать о возможности принять этот объект.
	 **/
	public void dragEnter(DropTargetDragEvent e) {
		if (e.isDataFlavorSupported(Scribble.scribbleDataFlavor)
				||e.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			e.acceptDrag(DnDConstants.ACTION_COPY_OR_MOVE);
			this.setBorder(dropBorder);
		}
	}

	/** 
	 * Пользователь выполняет перетаскивание уже не над нами,
	 * поэтому восстанавливаем рамку
	 **/
	public void dragExit(DropTargetEvent e) {
		this.setBorder(normalBorder); 
	}

	/** 
	 * Это основной метод интерфейса DropTargetListener. 
	 * Он вызывается, когда пользователь отпускает что㮸либо над нами.
	 **/
	public void drop(DropTargetDropEvent e) {
		// Восстанавливаем первоначальную рамку
		this.setBorder(normalBorder);
		// Сначала проверяем, понимаем ли мы формат данных объекта, 
		// который был над нами отпущен. Если мы поддерживаем его форматы 
		// данных, принимаем его, иначе – отвергаем.
		if (e.isDataFlavorSupported(Scribble.scribbleDataFlavor)
				||e.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			e.acceptDrop(DnDConstants.ACTION_COPY_OR_MOVE);
		}
		else {
			e.rejectDrop();
			return;
		}
		// Мы приняли объект, поэтому сейчас пробуем извлечь
		// его данные из объекта Transferable.
		Transferable t = e.getTransferable(); // Сохраняем данные
		Scribble droppedScribble; // Здесь будет храниться объект Scribble
		// Сначала пытаемся получить данные прямо в виде объекта Scribble
		try {
			droppedScribble = (Scribble)
					t.getTransferData(Scribble.scribbleDataFlavor);
		}
		catch (Exception ex) { // Неизвестный формат, исключение ввода/вывода и др.
			// Если это не сработало, пытаемся получить его 
			// в виде строки, а затем проанализировать (parse) ее.
			try {
				String s = (String)
						t.getTransferData(DataFlavor.stringFlavor);
				droppedScribble = Scribble.parse(s);
			}
			catch(Exception ex2) {
				// Если мы все же не смогли извлечь данные,
				// сообщаем системе о нашей неудаче
				e.dropComplete(false);
				return;
			}
		}
		// Если мы дошли до этого места, значит, мы получили объект Scribble
		Point p = e.getLocation();  // Где произошло отпускание
		// Перемещаем его туда
		droppedScribble.translate(p.getX(), p.getY());
		// Вносим в список отображения
		scribbles.add(droppedScribble);
		repaint();                  // Требуем перерисовки
		e.dropComplete(true);       // Сообщаем об успехе!
	}
	// Это неиспользуемые методы интерфейса DropTargetListener
	public void dragOver(DropTargetDragEvent e) {}
	public void dropActionChanged(DropTargetDragEvent e) {}

	/**
	 * Метод main(). Создает с помощью этого класса простое
	 * приложение. Обратите внимание на кнопки, служащие  
	 * для переключения между режимами “рисование” и “перетаскивание”.
	 **/
	public static void main(String[] args) {
		// Создаем окно и помещаем в него панель для рисования
		JFrame frame = new JFrame("ScribbleDragAndDrop");
		final ScribbleDragAndDrop scribblePane = new ScribbleDragAndDrop();
		frame.getContentPane().add(scribblePane, BorderLayout.CENTER);
		// Создаем две кнопки переключения режимов
		JToolBar toolbar = new JToolBar();
		ButtonGroup group = new ButtonGroup();
		JToggleButton draw = new JToggleButton("Draw");
		JToggleButton drag = new JToggleButton("Drag");
		draw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scribblePane.setDragMode(false);
			}
		});
		drag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scribblePane.setDragMode(true);
			}
		});
		group.add(draw); group.add(drag);
		toolbar.add(draw); toolbar.add(drag);
		frame.getContentPane().add(toolbar, BorderLayout.NORTH);
		// Начинаем в режиме “рисование”
		draw.setSelected(true);
		scribblePane.setDragMode(false);
		// Показываем окно
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
}