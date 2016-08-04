package view;

import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import BsTree.BsTreeGUI;

public class TPanel extends JPanel 
{
	public TPanel() 
	{
		setLayout(null);
		JButton btn = new JButton ("посадить дерево");
		btn.setBounds(10, 10, 200, 20);
		add(btn);
		btn.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				int [] ini = {50,25,40,20,11,55,24,30,75,77,100,60,98,45,22,43,7,66,80};
				BsTreeGUI tree = new BsTreeGUI();
				tree.init(ini);	
				tree.printGUI((Graphics2D) getGraphics(), getWidth());
			}
		});
	}
}
