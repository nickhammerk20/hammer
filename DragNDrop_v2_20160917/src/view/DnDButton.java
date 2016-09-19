package view;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import blogic.DnDCommand;

public class DnDButton extends JPanel
{
	public DnDButton ( DnDCommand cmd ) 
	{
		JPanel panelButton = new JPanel();
		setBounds(7, 50, 90, 500);
		
		BoxLayout bl = new BoxLayout(panelButton, BoxLayout.PAGE_AXIS);
		panelButton.setLayout(bl);
		
		panelButton.add (new DnDButtonWidth ( cmd ) );
		panelButton.add (new DnDButtonColor ( cmd ) );
		panelButton.add (new DnDButtonType ( cmd ) );
		panelButton.add (new DnDButtonFile ( cmd ) );
		
		add(panelButton);
		panelButton.setBorder(BorderFactory.createEtchedBorder());
				
		setVisible(true);
	}
}