package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;

import blogic.Person;

public class PDialog extends JDialog
{
	JTextField textID = null;
	JTextField textFName = null;
	JTextField textLName = null;
	JTextField textAge = null;
	
	public String ret = "Cancel";
		
	public PDialog() 
	{
//		setTitle(titleName);
		setLayout(null);
		setBounds(300,300,240,205);
		textID = new JTextField();
		textID.setBounds(10, 10, 200, 20);
		add(textID);
		
		textFName = new JTextField();
		textFName.setBounds(10, 40, 200, 20);
		add(textFName);
		
		textLName = new JTextField();
		textLName.setBounds(10, 70, 200, 20);
		add(textLName);
		
		textAge = new JTextField();
		textAge.setBounds(10, 100, 200, 20);
		add(textAge);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(20, 130, 75 , 25);
		add(btnOk);
		btnOk.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				ret = "Ok";
				setVisible(false);
			}
		});
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(120, 130, 75 , 25);
		add(btnCancel);
		btnOk.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				ret = "Cancel";
				setVisible(false);
			}
		});
		
	}
	private void setPerson(Person p) 
	{
		textID.setText(null);
	
	}
	public Person getPerson()
	{
		Person p = new Person();
		p.id = Integer.parseInt(textID.getText());
		p.fname = textFName.getText();
		p.lname = textLName.getText();
		p.age = Integer.parseInt(textAge.getText());
		return p;
	}
	
}
