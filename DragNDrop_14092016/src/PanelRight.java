import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class PanelRight extends JPanel
{
	public PanelRight()
	{
		setLayout(null);
		setBounds(520, 40, 500, 470);
		setBackground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		setVisible(true);			
	}
}
