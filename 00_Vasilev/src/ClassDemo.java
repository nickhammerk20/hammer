import javax.swing.*;
// �������� ������:
class MyClass{
int num;
char symb;
String text;
}
// ������� ����� ���������:
public class ClassDemo{
public static void main(String[] args){
MyClass obj=new MyClass();
// ���������� ����� �������:
obj.num=12;
obj.symb='A';
obj.text="��������� ����";
// ����� ��� ����������� � ���� ���������:
String str="�������� ����� �������:\n";
str+="num="+obj.num+"\n";
str+="symb="+obj.symb+"\n";
str+="text="+obj.text;
// ����������� ����:
JOptionPane.showMessageDialog(null,str);}
}