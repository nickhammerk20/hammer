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

public class ServerJob2 
{
	private Socket cs = null;
	private DataOutputStream out = null;
	private DataInputStream  in  = null;
	private Gson gs = null;
	
	PersonDAO pd = null;

	public ServerJob2() throws IOException, InterruptedException
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
			System.out.println(str);
			Envelop env = gs.fromJson(str, Envelop.class);
			
			switch (env.cmd)
			{
				case "create":	pd.create(env.p);
				                break;
				case "read":	out.writeUTF(gs.toJson( new Envelop(pd.read()) ));
				                out.flush();
				                break;
				case "update":	pd.update(env.p);
				                break;
				case "delete":	pd.delete(env.p);
				                break;
			}
			Thread.sleep(50);
		}
	}
}
