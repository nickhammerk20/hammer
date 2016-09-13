import java.awt.*;
import java.awt.event.*;
import java.awt.datatransfer.*;
/**
 * Эта программа демонстрирует, как добавить в приложение 
 * возможность “копирования и вставки”
 **/
public class SimpleCutAndPaste extends Frame implements ClipboardOwner
{
	/** Метод main() создает окно и отображает его. */
	public static void main(String[] args) {
		Frame f = new SimpleCutAndPaste();
		f.addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { System.exit(0); }
		});
		f.pack();
		f.setVisible(true);
	}

	/** Текстовое поле, хранящее вырезаемый или вставляемый текст */
	TextField field;

	/**
	 * Конструктор создает очень простой тестовый графический
	 * интерфейс и регистрирует его в качестве слушателя событий от кнопок
	 **/
	public SimpleCutAndPaste() {
		super("SimpleCutAndPaste"); // Заголовок окна
		this.setFont(new Font("SansSerif", Font.PLAIN, 18)); // Используем
		// крупный шрифт 
		// Создаем кнопку “Cut”
		Button copy = new Button("Copy");            
		copy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { copy(); }
		});
		this.add(copy, "West");

		// Создаем кнопку “Paste”
		Button paste = new Button("Paste");
		paste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { paste(); }
		});
		this.add(paste, "East");

		// Создаем текстовое поле, с которым они обе работают 
		field = new TextField();
		this.add(field, "North");
	}

	/**
	 * Этот метод принимает текущее содержимое текстового
	 * поля, создает объект StringSelection для представления 
	 * этой строки и помещает StringSelection в буфер обмена
	 **/
	public void copy() {
		// Получаем текущее отображаемое значение 
		String s = field.getText();         

		// Создаем объект StringSelection для представления этого текста. 
		// StringSelection является предопределенным классом, реализующим для нас

		// интерфейсы Transferable и ClipboardOwner. 
		StringSelection ss = new StringSelection(s); 

		// Сейчас делаем объект StringSelection содержимым буфера обмена.
		// А также указываем, что мы являемся владельцем буфера обмена. 
		// Выделяем текст, указывая на то, что он находится в буфере обмена.
		field.selectAll();
	}

	/**
	 * Получаем содержимое буфера обмена и, если мы распознаем 
	 * его тип, отображаем его содержимое. Этот метод распознает
	 * строки и списки файлов.
	 **/
	public void paste() {
		// Получаем буфер обмена
		Clipboard c = this.getToolkit().getSystemClipboard();

		// Получаем содержимое буфера обмена в виде объекта Transferable 
		Transferable t = c.getContents(this);
		// Выясняем, какой тип данных находится в буфере обмена 
		try { 
			if (t.isDataFlavorSupported(DataFlavor.stringFlavor)) {
				// Если это строка – получаем и отображаем строку
				String s = (String) t.getTransferData(DataFlavor.stringFlavor);
				field.setText(s); 

			}
			else if (t.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
				// Если это список объектов File – получаем этот список 
				// и отображаем имя первого файла списка
				java.util.List files = (java.util.List)
						t.getTransferData(DataFlavor.javaFileListFlavor);
				java.io.File file = (java.io.File)files.get(0);
				field.setText(file.getName());
			}
		}
		// Если при передаче что㜀либо происходит не так, 
		// просто выдаем звуковой сигнал и ничего не делаем.
		catch (Exception e) { this.getToolkit().beep(); }
	}
	/**
	 * Этот метод реализует интерфейс ClipboardOwner. Он вызывается, 
	 * когда в буфер обмена помещается что㺰либо еще.
	 **/
	public void lostOwnership(Clipboard c, Transferable t) {
		// Снимаем выделение с текстового поля, так как мы больше не “владеем” 
		// буфером обмена, и данный текст больше не доступен для вставки.
		field.select(0,0);
	}
}
