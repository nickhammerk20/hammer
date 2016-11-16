package chatIO_login_msg_exit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class ChatIO 
{
	private Socket cs = null;
	private DataOutputStream out = null;
	private DataInputStream  in  = null;
	private InputRead irr;
	private Boolean isActive = true;
	
	private ArrayList<ActionListener> lst = new ArrayList<ActionListener>(); 
	
	public ChatIO() throws UnknownHostException, IOException 
	{
		cs = new Socket("127.0.0.1",7777);
		out = new DataOutputStream(cs.getOutputStream());
		in  = new DataInputStream(cs.getInputStream());
		
		irr = new InputRead();
		irr.start();
		
		String name = JOptionPane.showInputDialog("enter your name");
		login(name);
	}
	public void login(String str) throws IOException
	{
		out.writeUTF("login:" + str);
		out.flush();
	}
	
	public void exit() throws IOException
	{
		out.writeUTF("exit:");
		out.flush();
				
		out.close();
		in.close();
		cs.close();
		isActive = false;
		irr = null;
	}
	
	public void send(String str) throws IOException
	{
		out.writeUTF("msg:" + str);
		out.flush();
	}

	public void addReceiveListener( ActionListener ee)
	{
		lst.add(ee);
	}

	private class InputRead extends Thread
	{
		@Override
		public void run() 
		{
			try 
			{
				while(isActive)
				{
					if( in.available() > 0 )
					{
						String str = in.readUTF();
						for (ActionListener a : lst)
						{
							ActionEvent e = new ActionEvent(ChatIO.this, 1, str);
							a.actionPerformed(e);
						}
					}
					Thread.sleep(50);
				}
			}
			catch (IOException | InterruptedException e) 
			{
				e.printStackTrace();
			}
		}		
	}
}
