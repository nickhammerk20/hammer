package calc_mini;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Xpanel extends JPanel 
{
	JTextField txtA = null;
	JTextField txtOP = null;
	JTextField txtB = null;
	JTextField txtRez = null;
	
	public Xpanel() 
	{
		setLayout(null);
		
		txtA = new JTextField();
		txtA.setBounds(10, 10, 200, 20);
		add( txtA );
		
		txtOP = new JTextField();
		txtOP.setBounds(10, 40, 200, 20);
		add( txtOP );
		
		txtB = new JTextField();
		txtB.setBounds(10, 70, 200, 20);
		add( txtB );
		
		txtRez = new JTextField();
		txtRez.setBounds(10, 100, 200, 20);
		add( txtRez );
		
		JButton btn = new JButton("Calc");
		btn.setBounds(10, 130, 100, 20);
		add( btn );
		
		btn.addActionListener( new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				int a = Integer.parseInt(txtA.getText());
				int b = Integer.parseInt(txtB.getText());
				int op = txtOP.getText().charAt(0);
				txtRez.setText( "" + XCalc.calc(a,b,op)); 
			}
		});
		
	
	}
}

	
