package chatIO_login_msg_exit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientJob 
{
	public ClientJob() throws UnknownHostException, IOException 
	{
		ChatIO io = new ChatIO();
		io.addReceiveListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println( e.getActionCommand() );	
			}
		} );

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your name: ");
		io.login(sc.nextLine());

		while(sc.hasNext())
		{
			String str = sc.nextLine();
			System.out.println(str);
			if(str.equals("exit"))
			{
				io.exit();
			}
			else
			{
				io.send(str);
			}
		}
	}
}
