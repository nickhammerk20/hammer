import javax.swing.*;
public class UsingFor{
   public static void main(String[] args){
   // ������� �����, ��������� ���������� � ���������� ��� ������ �����:
   int count,i,s=0;
   // ���������� ������� �����:
   count=Integer.parseInt(JOptionPane.showInputDialog("������� ������� �����"));
   // ��������� ����������:
   String text="����� ����������� ����� �� 1 �� "+count+": ";
   // ���������� ����� ���������� for:
   for(i=1;i<=count;i++){
   s+=i;}
   // ����� ���� ��������� �� �����:
   JOptionPane.showMessageDialog(null,text+s);
   }
}