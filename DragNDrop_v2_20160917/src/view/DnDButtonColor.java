package view;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

import blogic.DnDCommand;

public class DnDButtonColor extends JPanel
{
	public DnDButtonColor( DnDCommand cmd ) 
	{
		JPanel panelButton = new JPanel();
		setBorder(BorderFactory.createEtchedBorder());
		BoxLayout bl = new BoxLayout(panelButton, BoxLayout.PAGE_AXIS);
		panelButton.setLayout(bl);
		
		JButton colorBLACK = new JButton ("B");
		colorBLACK.setForeground(Color.BLACK);
		colorBLACK.setActionCommand("BLACK");
		colorBLACK.addActionListener(cmd.aColor);
		panelButton.add(colorBLACK);
		
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
