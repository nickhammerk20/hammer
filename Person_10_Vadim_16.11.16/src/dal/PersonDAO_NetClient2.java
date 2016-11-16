package dal;

import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import blogic.Person;
import server.Envelop;

public class PersonDAO_NetClient2 implements PersonDAO
{
	private Socket cs = null;
	private DataOutputStream out = null;
	private DataInputStream  in  = null;
	private Gson gs = null;

	public PersonDAO_NetClient2() 
	{
		try
		{
			cs = new Socket("127.0.0.1",7777);
			out = new DataOutputStream(cs.getOutputStream());
			in  = new DataInputStream(cs.getInputStream());
			gs = new Gson();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	@Override
	public void create(Person p) 
	{		
		try 
		{
			out.writeUTF( gs.toJson( new Envelop("create", p) ) );
			out.flush();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Person> read() 
	{
		ArrayList<Person> pp = null;
		try 
		{
			out.writeUTF( gs.toJson( new Envelop("read", null) ) );
			out.flush();
			String str = in.readUTF();
			Envelop env = gs.fromJson(str, Envelop.class);
			pp = env.pp;
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return pp;
	}

	@Override
	public void update(Person p) 
	{
		try 
		{
			out.writeUTF( gs.toJson( new Envelop("update", p) ) );
			out.flush();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Person p) 
	{
		try 
		{
			out.writeUTF( gs.toJson( new Envelop("delete", p) ) );
			out.flush();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
