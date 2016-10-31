package chat_thread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientJob 
{
	DataOutputStream out = null;
	DataInputStream  in  = null;

	public ClientJob() throws UnknownHostException, IOException 
	{
		Socket cs = new Socket("127.0.0.1",7777);
		out = new DataOutputStream(cs.getOutputStream());
		in  = new DataInputStream(cs.getInputStream());

		InputRead irr = new InputRead();
		irr.start();

		Scanner sc = new Scanner(System.in);

		while(sc.hasNext())
		{
			String str = sc.nextLine();
			System.out.println(str);
			out.writeUTF(str);
			out.flush();
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
					if( in.available() > 0 )
					{
						System.out.println( in.readUTF() );
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
