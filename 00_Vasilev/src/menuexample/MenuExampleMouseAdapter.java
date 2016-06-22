package menuexample;

import java.awt.event.*;
import javax.swing.JLabel;

public class MenuExampleMouseAdapter extends MouseAdapter
{
 String messageEntered;
 String messageExited;
 JLabel status;
 /**
  * �����������
  * @param messageEntered ������ ������� ������� � ������ 
  * ������� �� ����� ������� �� �������
  * @param messageExited ������ ������� ������� � ������ 
  * ������� �� ������ ������� �� ������� ��������
  * status ������ ������� � ������� ���������� �����
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