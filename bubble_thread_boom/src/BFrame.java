import javax.swing.JFrame;

public class BFrame extends JFrame
{
	public BFrame()
	{
		setTitle("Balls");
		int w = 800, h = 700;//размеры фрейма
		setBounds(50, 15, w, h); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new BPanelT());
		
		setVisible(true);
	}
}
