package blogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.Action;
import javax.swing.JOptionPane;

import ChatGUI.ChatLogin;
import ChatGUI.ChatPanel;
import chatIO_login_msg_exit.ChatIO;

public class ChatCMD
{
	ChatIO cio = null;
	ChatPanel cp = null;
	
	
	
	public ChatCMD(ChatPanel chatPanel)
	{
		try 
		{			
			this.cp = chatPanel;			
			cio = new ChatIO();			
		} 
		catch (UnknownHostException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	public ActionLogin aLogin = new ActionLogin();
	public ActionSend aSend = new ActionSend();
	public ActionExit aExit = new ActionExit();
	public ActionUpdateMsg uMSG = new ActionUpdateMsg();  
	
	class ActionUpdateMsg implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			System.out.println( e.getActionCommand() );			
		}		
	}
	
	class ActionLogin implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			ChatLogin cl = new ChatLogin();
			cl.setTitle("Login");
			cl.setModal(false);
			cl.setVisible(true);
			
			if(cl.ret.equals("Ok"))
			{
				System.out.println("start OK - Login");
			}
		}		
	}
	class ActionSend implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			System.out.println("start MSG send");
			try
			{
				System.out.println(cp.getMsg());
				cio.send(cp.getMsg());
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}		
	}
	class ActionExit implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			System.out.println("start close Chat. Exit.");
			try
			{
				cio.exit();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
