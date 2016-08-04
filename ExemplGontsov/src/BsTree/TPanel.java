﻿package BsTree;

import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

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
//				int [] ini = {50,25,40,20,11,55,24,30,75,77,100,60,98,45,22,43,7,66,80};
//				int[] ini = {55,24,5,98,45,53,12,104,111,15,4,62,84,59,91,77,70,75,71,110};
//				int[] ini = {80,75,100,50,150,25,70,90,170,15,40,73,85,95,125,
//						190,10,20,30,45,115,140,130,5,12,17,23,27,35,42,47,
//						110,120,127,135,145,142,147,105,112,117,123};
				int[] ini = {50,25,40,20,11,24,30,66,75,100,60,45,22,43,77};
				
				BsTreeGUI tree = new BsTreeGUI();
				tree.init(ini);	
				tree.printGUI((Graphics2D) getGraphics(), getWidth());
			}
		});
	}
}
