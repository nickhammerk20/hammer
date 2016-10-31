package chat_timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.Timer;;

public class ClientJob 
{
	DataOutputStream out = null;
	DataInputStream  in  = null;

	public ClientJob() throws UnknownHostException, IOException 
	{
		Socket cs = new Socket("127.0.0.1",7777);
		out = new DataOutputStream(cs.getOutputStream());
		in  = new DataInputStream(cs.getInputStream());

		Timer tm = new Timer ( 50 , new tmr());
		tm.start();

		Scanner sc = new Scanner(System.in);

		while(sc.hasNext())
		{
			String str = sc.nextLine();
			System.out.println(str);
			out.writeUTF(str);
			out.flush();
		}
	}
	class tmr implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			try 
			{
				if( in.available() > 0 )
				{
					System.out.println( in.readUTF() );
				}
			} 
			catch (IOException e1) 
			{
				e1.printStackTrace();
			}
		}		
	}
}
