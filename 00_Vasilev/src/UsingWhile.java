import javax.swing.*;
public class UsingWhile{
   public static void main(String[] args){
   // ������� �����, ��������� ���������� � ���������� ��� ������ �����:
   int count,i=1,j=1,s1=0,s2=0;
   // ���������� ������� �����:
   count=Integer.parseInt(JOptionPane.showInputDialog("������� ������� �����"));
   // ��������� ����������:
   String text="����� ����������� ����� �� 1 �� "+count+".\n";
   String str1="�������� while: ";
   String str2="�������� do-while: ";
   // ���������� ����� ���������� while:
   while(i<=count){
   s1+=i;
   i++;}
   // ���������� ����� ���������� do-while:
   do{
   s2+=j;
   j++;
   }while(j<=count);
   // ��������� ������ ��� ���������:
   str1+=s1+"\n";
   str2+=s2;
   // ����� ���� ��������� �� �����:
   JOptionPane.showMessageDialog(null,text+str1+str2);
   }
}