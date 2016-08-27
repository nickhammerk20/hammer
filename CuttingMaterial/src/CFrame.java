import javax.swing.JFrame;

public class CFrame extends JFrame
{	
	public CFrame()
	{
		setLayout(null);
		setTitle("Cutting Material");
		setBounds(100, 100, 1050, 560);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add (new CPanelFirst() );
		add (new CPanelSecond() );
		

		setVisible(true);
	}
}
