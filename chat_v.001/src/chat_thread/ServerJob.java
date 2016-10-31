package chat_thread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerJob 
{
	ArrayList<ClientCon> cc = new ArrayList<ClientCon>();

	public ServerJob() throws IOException
	{
		ServerSocket ss = new ServerSocket(7777);

		InputRead irr = new InputRead();
		irr.start();

		while(true)
		{
			cc.add( new ClientCon(ss.accept()) );
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
							for (int j = 0; j < cc.size(); j++)
							{
								cc.get(j).out.writeUTF( "from Server => " + str);
								cc.get(j).out.flush();
							}
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
