package dal;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import blogic.Person;

public class PersonDAO_HTTP implements PersonDAO
{	
	private Gson gs = null;

	public PersonDAO_HTTP() 
	{
		gs = new Gson();
	}

	@Override
	public void create(Person p) 
	{	
		try {

			String url = "http://localhost/myPERSON/personCREATE.php";

			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(url);

			request.addHeader("id", ""+p.id);
			request.addHeader("fname", p.fname);
			request.addHeader("lname", p.lname);
			request.addHeader("age", ""+p.age);

			HttpResponse response = client.execute(request);

			System.out.println("Response Code : "
					+ response.getStatusLine().getStatusCode());
			BufferedReader rd = new BufferedReader(
					new InputStreamReader(response.getEntity().getContent()));

			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) 
			{
				result.append(line);
			}

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
		try {
			String url = "http://localhost/myPERSON/personREAD_json.php";

			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(url);

			HttpResponse response = client.execute(request);

			System.out.println("Response Code : "
					+ response.getStatusLine().getStatusCode());

			BufferedReader rd = new BufferedReader(
					new InputStreamReader(response.getEntity().getContent()));

			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) 
			{
				result.append(line);
			}
			pp = gs.fromJson(result.toString(), new TypeToken<ArrayList<Person>>(){}.getType());
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
	}

	@Override
	public void delete(Person p) 
	{
	}
}
