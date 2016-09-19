package view;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import blogic.DnDCommand;

public class DnDButtonType extends JPanel
{
	public DnDButtonType( DnDCommand cmd ) 
	{
		JPanel panelButton = new JPanel();
		setBorder(BorderFactory.createEtchedBorder());
		BoxLayout bl = new BoxLayout(panelButton, BoxLayout.Y_AXIS);
		panelButton.setLayout(bl);
		
		JButton square = new JButton ("sq"); //square
		square.addActionListener(cmd.aType);
		square.setActionCommand("square");
		panelButton.add(square);
		
		JButton roundSquare = new JButton ("rSq"); //round square
		roundSquare.addActionListener(cmd.aType);
		roundSquare.setActionCommand("roundSquare");
		panelButton.add(roundSquare);
		
		JButton sircle = new JButton ("sircle");
		sircle.addActionListener(cmd.aType);
		sircle.setActionCommand("sircle");
		panelButton.add(sircle);
		
		JButton line = new JButton ("line");
		line.addActionListener(cmd.aType);
		line.setActionCommand("line");
		panelButton.add(line);
		
		add(panelButton);
	}
}
