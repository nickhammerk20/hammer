import javax.swing.JOptionPane;
public class UsingVar {

	public static void main(String[] args) {
		String name="������ ���� ��������";
		int age=60;
		char category='B';
		String text="��������: "+name;
		text=text+"\n"+"�������: "+age+" ���";
		text=text+'\n'+"����� ���������: "+category;
		JOptionPane.showMessageDialog(null, text);

	}

}
