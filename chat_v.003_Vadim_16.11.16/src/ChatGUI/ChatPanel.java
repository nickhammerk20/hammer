package ChatGUI;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import blogic.ChatCMD;
import chatIO_login_msg_exit.ChatIO;

public class ChatPanel extends JPanel
{
	private JTextArea textArea = null;
	private JTextField textMsg = null;
	private JButton btnSendMSG;
	private JButton btnExit;

	public ChatPanel() throws UnknownHostException, IOException 
	{
		setLayout(null);
		
		ChatIO io = new ChatIO();
		ChatCMD cmd = new ChatCMD(this, io);
		
		textArea = new JTextArea("", 20, 50);
		textArea.setEditable(false);
		textArea.setLineWrap(true);		
		
		JScrollPane scr = new JScrollPane(textArea);
		scr.setBounds(10, 10, 360, 480);
		add( scr );		
		
		textMsg = new JTextField();
		textMsg.setBounds(10, 500, 260, 55);
		add(textMsg);

		btnSendMSG = new JButton("Send...");
		btnSendMSG.setBounds(280, 500, 90 , 25);
		add(btnSendMSG);
		btnSendMSG.addActionListener(cmd.aSend);

		btnExit = new JButton("Exit");
		btnExit.setBounds(280, 530, 90 , 25);
		add(btnExit);
		btnExit.addActionListener(cmd.aExit);

		io.addReceiveListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				updateMSG(e.getActionCommand());
			}
		} );
	}

	public String getMsg()
	{
		String ret = textMsg.getText();
		textMsg.setText("");		
		return ret;
	}
	public void updateMSG (String str)
	{
		textArea.append(str);
		textArea.append("\n");
	}	
}
