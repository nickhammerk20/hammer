package chat_thread_task;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.plaf.SliderUI;

import org.omg.CORBA.TIMEOUT;

public class ClientJob 
{
	DataOutputStream out = null;
	DataInputStream  in  = null;
	private String name = null;

	public ClientJob() throws UnknownHostException, IOException 
	{
		nickName();
		
		Socket cs = new Socket("127.0.0.1",7777);
		out = new DataOutputStream(cs.getOutputStream());
		in  = new DataInputStream(cs.getInputStream());
				
		InputRead irr = new InputRead();
		irr.start();

		Scanner sc = new Scanner(System.in);

		while(sc.hasNext())
		{
			String str = sc.nextLine();
			if ( str.equals("exit"))
			{
				out.writeUTF(name + " leave our chat.");
				out.flush();	
				System.out.println("Your leave chat. Goodbye " + name + "!");
//				out.writeUTF(str);
//				out.flush();				
				break;
			}
			System.out.println(str);
			out.writeUTF(name + ": "+ str);
			out.flush();
		}
		System.exit(0);
	}
	
	private void nickName()
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Please enter your name: ");
		name = in.nextLine();
		System.out.println("Hello! " + name +"!");
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
