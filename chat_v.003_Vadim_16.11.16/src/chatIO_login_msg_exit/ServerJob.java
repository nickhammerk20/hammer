package chatIO_login_msg_exit;

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
							String[] s = str.split(":");
							if(s[0].equals("login"))
							{
								cc.get(i).name = s[1];
								System.out.println("We get new freind "+ cc.get(i).name + "!");
							}
							if(s[0].equals("exit"))
							{
								System.out.println("Goodbye " + cc.get(i).name);
								cc.remove(i);
							}
							if(s[0].equals("msg"))
							{
								System.out.println( "from Client => " + cc.get(i).name +": "+ s[1] );
								for (int j = 0; j < cc.size(); j++)
								{
									cc.get(j).out.writeUTF( "from Server => "+ cc.get(i).name +": "+ s[1]);
									cc.get(j).out.flush();
								}
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
		String name = null;

		public ClientCon(Socket cs) throws IOException 
		{
			this.cs = cs;
			out = new DataOutputStream(cs.getOutputStream());
			in  = new DataInputStream(cs.getInputStream());
		}
	}
}
