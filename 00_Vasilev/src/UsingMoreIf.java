import javax.swing.*;
public class UsingMoreIf{
   public static void main(String[] args){
   // ��������� ���������� ��� ���������� ����� ������������
   // � ������ ������, ���������� � ���������� ����:
   String text,str;
   // ���������� ������ (�����), ���������� �������������:
   text=JOptionPane.showInputDialog("������� ����� �����:");
   // �������� ������������ �����:
   if(text==null){System.exit(0);}
   // ����������� ����� (�������������� ������ � �����):
   int num=Integer.parseInt(text);
   // ��������� �������� ���������:
   if(num<0){str="�� ����� ������������� �����!";}
   else if(num>100){str="��� ����� ������� �����!";}
   else if(num>10){str="�����, ������� ������!";}
   else{str="����� � �������� �� 0 �� 10!";}
   // ����������� ����������� ����:
   JOptionPane.showMessageDialog(null,str);
   }
}