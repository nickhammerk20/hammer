package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import com.google.gson.Gson;

import blogic.Person;
import dal.PersonDAO;
import dal.PersonDAO_Mock;

public class ServerJob 
{
	private Socket cs = null;
	private DataOutputStream out = null;
	private DataInputStream  in  = null;
	private Gson gs = null;
	
	PersonDAO pd = null;

	public ServerJob() throws IOException, InterruptedException
	{
		ServerSocket ss = new ServerSocket(7777);
		gs = new Gson();
		
		pd = new PersonDAO_Mock();

		cs = ss.accept();
		out = new DataOutputStream(cs.getOutputStream());
		in  = new DataInputStream(cs.getInputStream());

		while(true)
		{
			String str = in.readUTF();
			String cmd = str.substring(0, str.indexOf(":"));
			String data = str.substring(str.indexOf(":")+1);
			
			System.out.println(cmd);
			System.out.println(data);
			
			
			switch (cmd)
			{
				case "create":	pd.create(gs.fromJson(data, Person.class));
				                break;
				case "read":	out.writeUTF(gs.toJson(pd.read()));
				                out.flush();
				                break;
				case "update":	pd.update(gs.fromJson(data, Person.class));
				                break;
				case "delete":	pd.delete(gs.fromJson(data, Person.class));
				                break;
			}
			Thread.sleep(50);
		}
	}
}
