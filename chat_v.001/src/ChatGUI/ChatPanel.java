package ChatGUI;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import blogic.ChatCMD;

public class ChatPanel extends JPanel 
{
	public JTable tbl = null;
	JTextField textMsg = null;
	
	public ChatPanel() 
	{
		setLayout(null);
		
		ChatCMD cmd = new ChatCMD();
				
		JScrollPane scr = new JScrollPane(tbl);
		scr.setBounds(10, 10, 360, 480);
		add( scr );		
		
		textMsg = new JTextField();
		textMsg.setBounds(10, 500, 260, 55);
		add(textMsg);
		
		JButton btnSendMSG = new JButton("Send...");
		btnSendMSG.setBounds(280, 500, 90 , 25);
		add(btnSendMSG);
		btnSendMSG.addActionListener(cmd.aLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(280, 530, 90 , 25);
		add(btnExit);
	}
}
