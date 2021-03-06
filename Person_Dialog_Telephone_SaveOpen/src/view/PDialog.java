﻿package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.MaskFormatter;

import blogic.Person;
import blogic.PersonDM;

public class PDialog extends JDialog
{
	JTextField textID = null;
	JTextField textFName = null;
	JTextField textLName = null;
	JTextField textAge = null;
	JFormattedTextField textTelNumb = null;

	ArrayList<Person> pp = null;
	public String ret = "Cancel";
	PersonDM dm = null;
	Boolean visible = false;
	JButton btnOk = null;

	public PDialog() throws ParseException 
	{
		setLayout(null);
		setBounds(300,300,240,410);

		JLabel tID = new JLabel("ID:");
		tID.setBounds(10, 20, 200, 20);
		add(tID);

		textID = new JTextField();
		textID.getDocument().addDocumentListener(documentListener);
		textID.setBounds(10, 40, 200, 20);
		add(textID);

		JLabel tFN = new JLabel("First Name:");
		tFN.setBounds(10, 70, 200, 20);
		add(tFN);

		textFName = new JTextField();
		textFName.getDocument().addDocumentListener(documentListener);
		textFName.setBounds(10, 90, 200, 20);
		add(textFName);

		JLabel tLN = new JLabel("Last Name:");
		tLN.setBounds(10, 120, 200, 20);
		add(tLN);

		textLName = new JTextField();
		textLName.getDocument().addDocumentListener(documentListener);
		textLName.setBounds(10, 140, 200, 20);
		add(textLName);

		JLabel tAge = new JLabel("Age:");
		tAge.setBounds(10, 170, 200, 20);
		add(tAge);

		textAge = new JTextField();
		textAge.getDocument().addDocumentListener(documentListener);
		textAge.setBounds(10, 190, 200, 20);
		add(textAge);
		
		JLabel tTelNumb = new JLabel("Telephone number:");
		tTelNumb.setBounds(10, 220, 200, 20);
		add(tTelNumb);
		
		MaskFormatter textTelNumbFormat = new MaskFormatter("+3(###)-###-##-##");
		textTelNumb = new JFormattedTextField(textTelNumbFormat);
		textTelNumb.getDocument().addDocumentListener(documentListener);
		textTelNumb.setBounds(10, 240, 200, 20);
		
		add(textTelNumb);

		btnOk = new JButton("Ok");
		btnOk.setBounds(20, 270, 75 , 25);
		btnOk.setEnabled(false);
		add(btnOk);
		btnOk.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				ret = "Ok";
				System.out.println(ret);
				setVisible(false);
			}
		});

		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(120, 270, 75 , 25);
		add(btnCancel);
		btnCancel.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				ret = "Cancel";
				System.out.println(ret);
				setVisible(false);
			}
		});
	}

	DocumentListener documentListener = new DocumentListener()
	{
		public void check(JTextField textID, JTextField textFName, JTextField textLName, JTextField textAge, JTextField textTelNumb)
		{
			System.out.print("start = "+textID.getText()+" / "+textFName.getText()+" / "+textLName.getText()+" / "+textAge.getText()+ " = " );
			if (textID.getText().equals("") || textFName.getText().equals("") ||  textLName.getText().equals("") ||  textAge.getText().equals("")||  textTelNumb.getText().equals(""))
			{
				System.out.println("visible = false;");
				btnOk.setEnabled(false);
			}
			else 
			{
				System.out.println("visible = true;");
				btnOk.setEnabled(true);
			}
		}
		@Override
		public void changedUpdate(DocumentEvent e) 
		{
			check(textID, textFName, textLName, textAge, textTelNumb);
		}
		@Override
		public void insertUpdate(DocumentEvent e) 
		{
			check(textID, textFName, textLName, textAge, textTelNumb);
		}
		@Override
		public void removeUpdate(DocumentEvent e) 
		{
			check(textID, textFName, textLName, textAge, textTelNumb);	
		}		
	};	

	public void setPerson(Person p) 
	{
		textID.setText(""+p.id);
		textFName.setText(p.fname);
		textLName.setText(p.lname);
		textAge.setText(""+p.age);
		textTelNumb.setText(""+p.telNumber);
	}
	public Person getPerson()
	{
		Person p = new Person();
		p.id = Integer.parseInt(textID.getText());
		p.fname = textFName.getText();
		p.lname = textLName.getText();
		p.age = Integer.parseInt(textAge.getText());
		p.telNumber = textTelNumb.getText();
		return p;
	}

}
