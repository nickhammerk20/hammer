import javax.swing.*;
public class UsingIf {

	public static void main(String[] args) {
		//����� (��������� � �����������)
		double x,y;
		//��������� ����:
		String title="������� �����";
		//����� ��������� (��������� ��������):
		String text="��������� �������: ";
		//���������� ���������� ��� ���������:
		int type;
		//���������� ���������:
		x=Double.parseDouble(JOptionPane.showInputDialog("���������:"));
		//���������� �����������:
		y=Double.parseDouble(JOptionPane.showInputDialog("�����������:"));
		//�������� ��������: ����� �� ���� �����������?
		if(y!=0){type=JOptionPane.PLAIN_MESSAGE;
			text=text+x+"/"+y+"="+x/y;}
		else{type=JOptionPane.ERROR_MESSAGE;
			text=text+"������� �� ����!";}
		//����������� ���� � ����������:
		JOptionPane.showMessageDialog(null,text,title,type);
	}

}