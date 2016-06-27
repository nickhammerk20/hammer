import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PButtonFile extends JPanel 
{
	public PButtonFile(PCommand cmd) 
	{
		
		JPanel panelButton = new JPanel();
		setBorder(BorderFactory.createEtchedBorder());
		BoxLayout bl = new BoxLayout(panelButton, BoxLayout.Y_AXIS);
		panelButton.setLayout(bl);
		
		JButton bLoad = new JButton ("Load");
		bLoad.setActionCommand("blue");
		bLoad.addActionListener(cmd.aOpen);
		panelButton.add(bLoad);
		
		JButton bSave = new JButton ("Save");
		bSave.setActionCommand("blue");
		bSave.addActionListener(cmd.aSave);
		panelButton.add(bSave);
		
		add(panelButton);
	}
}
