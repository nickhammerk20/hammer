package chat_thread_in_out;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.Timer;

public class ServerJob 
{
	ArrayList<ClientCon> cc = new ArrayList<ClientCon>();
	ArrayList<String> message = new ArrayList<String>();
	public ServerJob() throws IOException
	{
		ServerSocket ss = new ServerSocket(7777);

		InputRead irr = new InputRead();
		irr.start();
		OutputWright oww = new OutputWright();
		oww.start();
		//		Timer timerPrBuf = new Timer(10000, new PrintBuffer() );
		//		timerPrBuf.start();

		while(true)
		{
			cc.add( new ClientCon(ss.accept()) );
		}
	}
	class PrintBuffer implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			for (String m : message) 
			{
				System.out.println("server buffer:" + m);
			}
		}
	}

	class OutputWright extends Thread
	{
		@Override
		public void run() 
		{
			try 
			{
				while(true)
				{
					for( int i = 0 ; i < message.size(); i++)
					{
						String str = message.get(i);
						for (int j = 0; j < cc.size(); j++)
						{						
							cc.get(j).out.writeUTF( "from Server => " + str);
							cc.get(j).out.flush();
						}
						message.remove(i);
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
	class InputRead extends Thread
	{
		@Override
		public void run() 
		{
			try 
			{
				while(true)
				{
					for (int i = 0; i < cc.size(); i++)
					{
						if( cc.get(i).in.available() > 0 )
						{
							String str = cc.get(i).in.readUTF();
							System.out.println( "from Client => "+str );
							message.add(str);
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

	class ClientCon
	{
		DataOutputStream out = null;
		DataInputStream  in  = null;
		Socket cs = null;

		public ClientCon(Socket cs) throws IOException 
		{
			this.cs = cs;
			out = new DataOutputStream(cs.getOutputStream());
			in  = new DataInputStream(cs.getInputStream());
		}
	}
}
