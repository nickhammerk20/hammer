package view;

import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import BsTree.BsTreeGUI;

public class TPanel extends JPanel 
{
	JTextField textVal = null;
	public BsTreeGUI tree = new BsTreeGUI();
	
	public TPanel() 
	{
		setLayout(null);
		JButton btnInit = new JButton ("Инициировать дерево");
		btnInit.setBounds(10, 10, 200, 20);
		add(btnInit);
		
		btnInit.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				int [] ini = {50,25,40,20,11,55,24,30,75,77,100,60,98,45,22,43,7,66,80};
//				BsTreeGUI tree = new BsTreeGUI();
				tree.init(ini);	
				tree.printGUI((Graphics2D) getGraphics(), getWidth());
				
			}
		});
		
		
		JButton btnAdd = new JButton ("Добавить элемент");
		btnAdd.setBounds(350, 10, 200, 20);
		add(btnAdd);
		
		textVal = new JTextField();
		textVal.setBounds(290, 10, 60, 20);
		add(textVal);
		
		btnAdd.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				int val = Integer.parseInt(textVal.getText());
				tree.add(val);	
				tree.printGUI((Graphics2D) getGraphics(), getWidth());			
				
			}
		});		
		
		JButton btnClear = new JButton ("Очистить");
		btnClear.setBounds(650, 10, 200, 20);
		add(btnClear);
		
		btnClear.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				tree.clear();
				repaint();			
			}
		});		
	}
}
