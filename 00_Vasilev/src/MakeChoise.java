import javax.swing.*;
public class MakeChoise {

	public static void main(String[] args) {
		int number=Integer.parseInt(JOptionPane.showInputDialog("������� �����:"));
		String text=number%2==0?"������":"��������";
		JOptionPane.showMessageDialog(null, "�� ����� "+text+" �����!");

	}

}