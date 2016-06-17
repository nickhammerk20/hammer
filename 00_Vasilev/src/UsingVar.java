import javax.swing.JOptionPane;
public class UsingVar {

	public static void main(String[] args) {
		String name="Иванов Иван Иванович";
		int age=60;
		char category='B';
		String text="Водитель: "+name;
		text=text+"\n"+"Возраст: "+age+" лет";
		text=text+'\n'+"Права категории: "+category;
		JOptionPane.showMessageDialog(null, text);

	}

}
