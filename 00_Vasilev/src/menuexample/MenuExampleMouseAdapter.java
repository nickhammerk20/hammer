package menuexample;

import java.awt.event.*;
import javax.swing.JLabel;

public class MenuExampleMouseAdapter extends MouseAdapter
{
 String messageEntered;
 String messageExited;
 JLabel status;
 /**
  * Конструктор
  * @param messageEntered строка которую выводим в строку 
  * статуса по входу курсора на элемент
  * @param messageExited строка которую выводим в строку 
  * статуса по выходу курсора за пределы элемента
  * status строка статуса в которую происходит вывод
  */ 
 public MenuExampleMouseAdapter(String messageEntered,String messageExited, JLabel status)
 {
  this.messageEntered=messageEntered;
  this.messageExited=messageExited;
  this.status=status;
 }
 public void mouseEntered(MouseEvent e)
 {
  status.setText(messageEntered);
 }
 public void mouseExited(MouseEvent e)
 {
  status.setText(messageExited);
 }
}