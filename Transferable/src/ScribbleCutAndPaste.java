import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.datatransfer.*; // Clipboard, Transferable, DataFlavor и др.
/** 
 * Этот компонент позволяет пользователю рисовать изображения в окне,
 * а также вырезать и вставлять их в приложения. Он хранит координаты мыши
 * в объекте Scribble, который используется при отображении рисунка,
 * а также для передачи рисунка в буфер обмена и обратно.
 * Компонент JPopupMenu предоставляет доступ к командам
 * cut (вырезать), copy (скопировать) и paste (вставить).
 **/
public class ScribbleCutAndPaste extends JComponent
  implements ActionListener, ClipboardOwner 
{
  Stroke linestyle = new BasicStroke(3.0f); // Рисуем широкими линиями
  Scribble scribble = new Scribble();       // Сохраняем наш рисунок
  Scribble selection;          // Копирование рисунка через вырезание
  JPopupMenu popup;            // Меню для команд вырезания и вставки
  public ScribbleCutAndPaste() {
    // Создаем “всплывающее” меню
    String[] labels = new String[] {   "Clear", "Cut", "Copy", "Paste" };
    String[] commands = new String[] { "clear", "cut", "copy", "paste" };
    popup = new JPopupMenu();                  // Создаем меню
    popup.setLabel("Edit");
    for(int i = 0; i < labels.length; i++) {
      JMenuItem mi = new JMenuItem(labels[i]); // Создаем элемент меню 
      mi.setActionCommand(commands[i]);    // Задаем для него действие
      mi.addActionListener(this);          // и слушатель этого действия 
      popup.add(mi);                       // Добавляем элемент к меню
    }
    // Наконец, регистрируем меню в компоненте, для которого 
    // оно будет появляться
    this.add(popup);
    // Добавляем слушатели событий для выполнения отрисовки и обработки меню
    addMouseListener(new MouseAdapter() {
        public void mousePressed(MouseEvent e) {
          if (e.isPopupTrigger())
            popup.show((Component)e.getSource(),
                  e.getX(), e.getY());
          else
            scribble.moveto(e.getX(), e.getY()); // Начинаем новую линию
        }
      });
    addMouseMotionListener(new MouseMotionAdapter() {
        public void mouseDragged(MouseEvent e) {
          // Если это не кнопка 1 мыши, игнорируем ее
          if ((e.getModifiers() & InputEvent.BUTTON1_MASK) == 0)
            return;
          scribble.lineto(e.getX(), e.getY());  // Добавляем линию 
          repaint();
        }
    });
}
/** 
 * Рисуем компонент. Этот метод основан на объекте Scribble,  
 * реализующем Shape.
 **/
public void paintComponent(Graphics g) {
  super.paintComponent(g);
  Graphics2D g2 = (Graphics2D) g;
  g2.setStroke(linestyle);  // Задаем широкие линии
  g2.draw(scribble);        // Рисуем scribble (рисунок)
}

/** Это метод интерфейса ActionListener, вызываемый 
    элементами всплывающего меню */
public void actionPerformed(ActionEvent event) {
  String command = event.getActionCommand();
  if (command.equals("clear")) clear();
  else if (command.equals("cut")) cut();
  else if (command.equals("copy")) copy();
  else if (command.equals("paste")) paste();
}
/** Этот метод очищает рисунок. Вызывается всплывающим меню */
void clear() {
  scribble = new Scribble();  // Получаем новый пустой рисунок
  repaint();                  // и перерисовываем все.
}
/** 
 * Делаем копию текущего рисунка и помещаем ее в буфер обмена. 
 * Мы можем сделать это, так как Scribble реализует интерфейс Transferable.
 * Пользователь вызывает данный метод с помощью всплывающего меню. 
 **/
public void copy() {
  // Получаем системный буфер обмена
  Clipboard c = this.getToolkit().getSystemClipboard();
  
  // Делаем копию объекта Scribble для передачи в буфер обмена
  selection = (Scribble) scribble.clone();
  
  // Помещаем копию в буфер обмена
  c.setContents(selection, // Что поместить в буфер обмена
         this);            // Кого уведомить о том, что “это” 
                           // там больше не находится
}
/** 
 * Команда cut (вырезать) похожа на команду copy (копировать),  
 * за исключением того, что мы удаляем текущий рисунок после его
 * копирования в буфер обмена.
 **/
public void cut() {
	 copy();
	    clear();
	  }
	  /** 
	   * Пользователь вызывает этот метод через всплывающее меню. 
	   * Сначала запрашиваем объект Transferable, находящийся в системном 
	   * буфере обмена. Затем запрашиваем у этого объекта Transferable
	   * данные рисунка, который он представляет. Пытаемся использовать оба 
	   * формата данных, поддерживаемых классом Scribble. Если это не работает, 
	   * выдаем звуковой сигнал, чтобы сообщить пользователю о неудаче операции.
	   **/
	  public void paste() {
	    Clipboard c = this.getToolkit().getSystemClipboard(); // Получаем буфер
	                                                          // обмена
	    Transferable t = c.getContents(this);      // Получаем его содержимое 
	    // Сейчас пытаемся получить объект Scribble 
	    Scribble pastedScribble = null;
	    try { 
	      pastedScribble =
	 (Scribble)t.getTransferData(Scribble.scribbleDataFlavor);
	    }
	    catch (Exception e) { // UnsupportedFlavor, NullPointer и т.п.
	      // Если это не работает, пытаемся вместо этого запросить строку.
	      try {
	        String s = (String)t.getTransferData(DataFlavor.stringFlavor);
	        // Мы получили строку и пытаемся преобразовать ее в объект Scribble
	        pastedScribble = Scribble.parse(s);
	      }
	      catch (Exception e2) { // UnsupportedFlavor, NumberFormat и т.п.
	        // Если мы не смогли получить и преобразовать строку, 
	        // прекращаем работу.
	        this.getToolkit().beep();  // Сообщаем пользователю об ошибке вставки 
	        return;
	      }
	    }
	    // Если мы оказались здесь, значит, мы получили объект Scribble из буфера
	    // обмена. Добавляем его к текущему рисунку и запрашиваем перерисовку. 
	    repaint();
	  }
	  
	  /** 
	   * Этот метод реализует интерфейс ClipboardOwner. Мы указываем 
	   * ClipboardOwner, когда копируем рисунок в буфер обмена. 
	   * Этот метод будет вызван, когда в буфер обмена будет скопировано  
	   * чтоото другое, и оно вытолкнет оттуда наши данные. Когда будет вызван
	   * этот метод, нам больше не нужно поддерживать нашу копию объекта Scribble,
	   * так как он больше не доступен для вставки. Обычно компонент выделяет
	   * выбранный объект, пока тот находится в буфере обмена, и использует
	   * этот метод для снятия выделения с объекта, когда он больше
	   * не находится в буфере обмена. 
	   **/
	  public void lostOwnership(Clipboard c, Transferable t) {
	    selection = null;
	  }
	  
	  /** Простой метод main для тестирования класса. */
	  public static void main(String[] args) {
	    JFrame frame = new JFrame("ScribbleCutAndPaste");
	    ScribbleCutAndPaste s = new ScribbleCutAndPaste();
	    frame.getContentPane().add(s, BorderLayout.CENTER);
	    frame.setSize(400, 400);
	    frame.setVisible(true);
	  }
	}