import javax.swing.*;
public class MakeChoise {

	public static void main(String[] args) {
		int number=Integer.parseInt(JOptionPane.showInputDialog("ВВедите число:"));
		String text=number%2==0?"чётное":"нечетное";
		JOptionPane.showMessageDialog(null, "Вы ввели "+text+" число!");

	}

}