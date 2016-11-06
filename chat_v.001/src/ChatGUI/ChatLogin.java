package ChatGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChatLogin extends JDialog
{
	JTextField textLogin = null;
	public String ret = "Cancel";
	
	public ChatLogin() 
	{
		setLayout(null);
		setBounds(300, 300, 235, 150);
		
		JLabel tID = new JLabel("Enter your login:");
		tID.setBounds(10, 20, 200, 20);
		add(tID);
		
		textLogin = new JTextField();
		textLogin.setBounds(10, 40, 200, 20);
		add(textLogin);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(20, 70, 75 , 25);
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
		btnCancel.setBounds(120, 70, 75 , 25);
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
}
