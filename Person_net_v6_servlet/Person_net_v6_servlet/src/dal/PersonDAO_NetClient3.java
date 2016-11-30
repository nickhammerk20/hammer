package dal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import blogic.Person;

public class PersonDAO_NetClient3 implements PersonDAO
{

	String url = null;

	public PersonDAO_NetClient3()
	{
		url = "http://localhost:8080/myproject/pers6";
	}

	@Override
	public void create(Person p)
	{

		try
		{			
			HttpClient client = HttpClientBuilder.create().build();
			String str = url + "?cmd=create" + "&id=" + p.id + "&fname=" + p.fname + 
					"&lname=" + p.lname + "&age=" + p.age; 
			
			HttpGet request = new HttpGet(str);
			HttpResponse response;

			response = client.execute(request);

			System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

	@Override
	public ArrayList<Person> read()
	{
		ArrayList<Person> pp = new ArrayList<Person>();

		try
		{
			HttpClient client = HttpClientBuilder.create().build();
			String str = url + "?cmd=read";
			HttpGet request = new HttpGet(str);
			HttpResponse response;

			response = client.execute(request);

			System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

			BufferedReader rd = new BufferedReader(
					new InputStreamReader(response.getEntity().getContent()));

			StringBuffer result = new StringBuffer();
			String line = "";

			while ((line = rd.readLine()) != null)
			{
				result.append(line);
			}

			line = result.toString();
			
			Gson gs = new Gson();
			pp = gs.fromJson(line, new TypeToken<ArrayList<Person>>(){}.getType());

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
			HttpClient client = HttpClientBuilder.create().build();
			String str = url + "?cmd=update" + "&id=" + p.id + "&fname=" + p.fname + 
					"&lname=" + p.lname + "&age=" + p.age;

			HttpGet request = new HttpGet(str);
			HttpResponse response;

			response = client.execute(request);

			System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

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
			String str = url + "?cmd=delete" + "&id=" + p.id;
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(str);
			HttpResponse response;

			response = client.execute(request);

			System.out.println("Response Code : " + response.getStatusLine().getStatusCode());
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
