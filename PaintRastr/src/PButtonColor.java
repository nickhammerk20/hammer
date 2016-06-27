import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PButtonColor extends JPanel
{
	public PButtonColor(PCommand cmd) 
	{
		JPanel panelButton = new JPanel();
		setBorder(BorderFactory.createEtchedBorder());
		BoxLayout bl = new BoxLayout(panelButton, BoxLayout.Y_AXIS);
		panelButton.setLayout(bl);
		
		JButton colorRed = new JButton ("R");
		colorRed.setForeground(Color.RED);
		colorRed.setActionCommand("red");
		colorRed.addActionListener(cmd.aColor);
		panelButton.add(colorRed);

		JButton colorGreen = new JButton ("G");
		colorGreen.setForeground(Color.green);
		colorGreen.setActionCommand("green");
		colorGreen.addActionListener(cmd.aColor);
		panelButton.add(colorGreen);

		JButton colorBlue = new JButton ("B");
		colorBlue.setForeground(Color.blue);
		colorBlue.setActionCommand("blue");
		colorBlue.addActionListener(cmd.aColor);
		panelButton.add(colorBlue);
		
		add(panelButton);
	}
	
}
