package calcFull;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Xpanel extends JPanel 
{
//	JTextField txtA = null;
//	JTextField txtOP = null;
//	JTextField txtB = null;
	JTextField input = null;
	
	public Xpanel() 
	{
		setLayout(null);
		
		input = new JTextField();
		input.setBounds(10, 10, 290, 20);
		input.toString();
		add( input );
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(10, 150, 50, 30);
		btn1.setActionCommand("1");
		add( btn1 );
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(70, 150, 50, 30);
		btn2.setActionCommand("2");
		add( btn2 );
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(130, 150, 50, 30);
		btn3.setActionCommand("3");
		add( btn3 );
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(10, 110, 50, 30);
		btn4.setActionCommand("4");
		add( btn4 );
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(70, 110, 50, 30);
		btn5.setActionCommand("5");
		add( btn5 );
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(130, 110, 50, 30);
		btn6.setActionCommand("6");
		add( btn6 );
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(10, 70, 50, 30);
		btn7.setActionCommand("7");
		add( btn7 );
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(70, 70, 50, 30);
		btn8.setActionCommand("8");
		add( btn8 );
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(130, 70, 50, 30);
		btn9.setActionCommand("9");
		add( btn9 );
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(10, 190, 110, 30);
		btn0.setActionCommand("0");
		add( btn0 );
		
		JButton btnDot = new JButton(",");
		btnDot.setBounds(130, 190, 50, 30);
		btnDot.setActionCommand(",");
		add( btnDot );
		
		JButton btnClear = new JButton("C");
		btnClear.setBounds(10, 35, 110, 30);
		btnClear.setForeground(Color.RED);
		btnClear.setActionCommand("C");
		add( btnClear );
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(200, 70, 50, 30);
		btnDiv.setActionCommand("/");
		add( btnDiv );
		
		JButton btnMult = new JButton("*");
		btnMult.setBounds(255, 70, 50, 30);
		btnMult.setActionCommand("*");
		add( btnMult );
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(200, 110, 50, 30);
		btnMinus.setActionCommand("-");
		add( btnMinus );
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(200, 150, 50, 70);
		btnPlus.setActionCommand("+");
		add( btnPlus );
				
		JButton btnEqually = new JButton("=");
		btnEqually.setBounds(255, 110, 50, 110);
		btnEqually.setForeground(Color.GREEN);
		add( btnEqually );
		
		ActionListener number = new inputNumber();
			
			btn1.addActionListener(number);
			btn2.addActionListener(number);
			btn3.addActionListener(number);
			btn4.addActionListener(number);
			btn5.addActionListener(number);
			btn6.addActionListener(number);
			btn7.addActionListener(number);
			btn8.addActionListener(number);
			btn9.addActionListener(number);
			btn0.addActionListener(number);
			
		ActionListener operator = new inputOperator();
		
			btnDiv.addActionListener(operator);
			btnMult.addActionListener(operator);
			btnMinus.addActionListener(operator);
			btnPlus.addActionListener(operator);
			
		
		btnEqually.addActionListener( new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				input.setText(e.getActionCommand());
				//System.out.println("פûגפûגפûג   "+input);
			}
		});
	}
		public class inputNumber implements ActionListener 
		{
	          public void actionPerformed(ActionEvent e) 
	          {
	        	  String a = input.getText();
	        	  input.setText(""+XCalc.fPress(a, e.getActionCommand()));
	          }
	     }
		public class inputOperator implements ActionListener 
		{
	          public void actionPerformed(ActionEvent e) 
	          {
	        	  String op = input.getText();
	        	  input.setText(""+XCalc.fPress(op, e.getActionCommand()));
	          }
	     }
	
	}

	


	
