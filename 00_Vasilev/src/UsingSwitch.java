import javax.swing.*;
public class UsingSwitch{
   public static void main(String[] args){
   // �������� ������������� �����:
   int num;
   // ����� �� ���� ����� � ����� ���������:
   String text,str;
   // ����������� ���� � ���������� ������:
   text=JOptionPane.showInputDialog("������� ����� ����� �� 0 �� 10:");
   // �������������� ������ � �����:
   num=Integer.parseInt(text);
   // �������� ������:
   switch(num){
   case 0:
   str="�� ����� ������� ��������!";
   break;
   case 1:
   str="�� ����� ��������� ��������!";
   break;
   case 2:
   case 3:
   case 5:
   case 7:
   str="�� ����� ������� �����!";
   break;
   case 4:
   case 6:
   case 8:
   case 10:
   str="�� ����� ������ �����!";
   break;
   default:
   str="�� ����� ����� 9 ���\n��������� �� ������� ���������!";
   }
   JOptionPane.showMessageDialog(null,str);
   }
}