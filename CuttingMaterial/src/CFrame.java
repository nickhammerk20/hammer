import javax.swing.JFrame;
import javax.swing.JLabel;

public class CFrame extends JFrame
{	
	public CFrame()
	{
		setLayout(null);
		setTitle("Cutting Material");
		setBounds(100, 100, 1050, 560);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel txt1 = new JLabel(" Material ");
		JLabel txt2 = new JLabel(" Details ");
		add (txt1);
		add (txt2);
		txt1.setBounds(10, 10, 100, 30);
		txt2.setBounds(520, 10, 600, 30);
		
		add (new CPanelFirst() );
		add (new CPanelSecond() );
		

		setVisible(true);
	}
}
