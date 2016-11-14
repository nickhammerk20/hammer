package ChatGUI;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import blogic.ChatCMD;

public class ChatPanel extends JPanel
{
	private JTextArea textArea = null;
	private JTextField textMsg = null;
	private JButton btnSendMSG;
	private JButton btnExit;

	public ChatPanel() 
	{
		setLayout(null);

		ChatCMD cmd = new ChatCMD(this);

		JScrollPane scr = new JScrollPane(textArea);
		scr.setBounds(10, 10, 360, 480);
		add( scr );		

		textArea = new JTextArea(20, 50);
		textArea.setEditable(false);
		textArea.setLineWrap(true);		

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

		xt t = new xt();
		t.start();		
	}

	public String getMsg()
	{
		String ret = textMsg.getText();
		textMsg.setText("");		
		return ret;
	}
	public void updateMSG ()
	{
		textArea.append("55");
		textArea.append("\n");
	}

	class xt extends Thread
	{
		@Override
		public void run() 
		{
			try 
			{
				while(true)
				{
					updateMSG();
					Thread.sleep(50);
				}	
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}

		}
	}
}
