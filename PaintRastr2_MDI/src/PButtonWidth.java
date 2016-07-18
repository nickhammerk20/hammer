import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PButtonWidth extends JPanel
{
	public PButtonWidth ( PCommand cmd )
	{
		JPanel panelButton = new JPanel();
		setBorder(BorderFactory.createEtchedBorder());
		BoxLayout bl = new BoxLayout(panelButton, BoxLayout.PAGE_AXIS);
		panelButton.setLayout(bl);
		
		JButton width1 = new JButton ("1");
		width1.setActionCommand("w1");
		width1.addActionListener(cmd.aWidth);
		panelButton.add(width1);

		JButton width5 = new JButton ("5");
		width5.setActionCommand("w5");
		width5.addActionListener(cmd.aWidth);
		panelButton.add(width5);

		JButton width10 = new JButton ("10");
		width10.setActionCommand("w10");
		width10.addActionListener(cmd.aWidth);
		panelButton.add(width10);
		
		add(panelButton);
	}
}
