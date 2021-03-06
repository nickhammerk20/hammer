package blogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ChatGUI.ChatLogin;

public class ChatCMD
{

	public ActionLogin aLogin = new ActionLogin();
	public ActionSend aSend = new ActionSend();
	public ActionExit aExit = new ActionExit();
	
	
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
		}
		
	}
	class ActionExit implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			System.out.println("start close Chat. Exit.");
		}
	}
}
