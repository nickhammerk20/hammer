package chat_timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.Timer;

import chat_timer.ClientJob.tmr;

public class ServerJob 
{
	ArrayList<ClientCon> cc = new ArrayList<ClientCon>();

	public ServerJob() throws IOException
	{
		ServerSocket ss = new ServerSocket(7777);

		Timer tm = new Timer ( 50 , new tmr());
		tm.start();

		while(true)
		{
			cc.add( new ClientCon(ss.accept()) );
		}
	}

	class tmr implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			try 
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
			} 
			catch (IOException e1) 
			{
				e1.printStackTrace();
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
