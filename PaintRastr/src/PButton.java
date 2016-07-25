import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class PButton extends JPanel
{
	public PButton ( PCommand cmd ) 
	{
		JPanel panelButton = new JPanel();
		setBounds(7, 3, 80, 500);
		
		BoxLayout bl = new BoxLayout(panelButton, BoxLayout.Y_AXIS);
		panelButton.setLayout(bl);
		
		panelButton.add (new PButtonWidth(cmd));
		panelButton.add (new PButtonColor(cmd));
		panelButton.add (new PButtonFile(cmd));
		
		add(panelButton);
		panelButton.setBorder(BorderFactory.createEtchedBorder());
				
		setVisible(true);
	}
}
