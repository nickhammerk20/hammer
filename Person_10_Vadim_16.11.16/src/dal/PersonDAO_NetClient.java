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

public class PersonDAO_NetClient implements PersonDAO
{
	private Socket cs = null;
	private DataOutputStream out = null;
	private DataInputStream  in  = null;
	private Gson gs = null;

	public PersonDAO_NetClient() 
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
			out.writeUTF("create:" + gs.toJson(p));
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
			out.writeUTF("read:");
			out.flush();
			String str = in.readUTF();
			System.out.println("json_vadim=> "+str);
			pp = gs.fromJson(str, new TypeToken<ArrayList<Person>>(){}.getType());
			
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
			out.writeUTF("update:" + gs.toJson(p));
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
			out.writeUTF("delete:" + gs.toJson(p));
			out.flush();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
