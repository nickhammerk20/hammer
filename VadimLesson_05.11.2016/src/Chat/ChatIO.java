package Chat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;


public class ChatIO 
{
	private Socket cs = null;
	private DataOutputStream out = null;
	private DataInputStream  in  = null;
	
	private ArrayList<ActionListener> lst = new ArrayList<ActionListener>(); 
	
	public ChatIO() throws UnknownHostException, IOException 
	{
		cs = new Socket("127.0.0.1",7777);
		out = new DataOutputStream(cs.getOutputStream());
		in  = new DataInputStream(cs.getInputStream());

		InputRead irr = new InputRead();
		irr.start();
	}
	
	public void send(String str) throws IOException
	{
		out.writeUTF(str);
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
				while(true)
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
