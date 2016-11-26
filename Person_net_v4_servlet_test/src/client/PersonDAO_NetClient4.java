package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

import com.google.gson.Gson;

import com.google.gson.reflect.TypeToken;

//запрос методом POST
public class PersonDAO_NetClient4 implements PersonDAO
{

	String url = null;

	public PersonDAO_NetClient4()
	{
		url = "http://localhost:8080/connectDB/pers2";
	}

	@Override
	public void create(Person p)
	{

		try
		{
			HttpClient client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(url);
			
			List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
			urlParameters.add(new BasicNameValuePair("cmd", "create"));
			urlParameters.add(new BasicNameValuePair("id", "" + p.id));
			urlParameters.add(new BasicNameValuePair("fname", p.fname));
			urlParameters.add(new BasicNameValuePair("lname", p.lname));
			urlParameters.add(new BasicNameValuePair("age", "" + p.age));
			
			post.setEntity(new UrlEncodedFormEntity(urlParameters));

			HttpResponse response = client.execute(post);
			System.out.println("Response Code : "
			                + response.getStatusLine().getStatusCode());

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
			HttpPost post = new HttpPost(url);

			List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
			urlParameters.add(new BasicNameValuePair("cmd", "read"));

			post.setEntity(new UrlEncodedFormEntity(urlParameters));

			HttpResponse response = client.execute(post);
			System.out.println("Response Code : "
			                + response.getStatusLine().getStatusCode());

			BufferedReader rd = new BufferedReader(
			        new InputStreamReader(response.getEntity().getContent()));

			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
			
			Gson gs = new Gson();
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
		try
		{
			HttpClient client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(url);
			
			List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
			urlParameters.add(new BasicNameValuePair("cmd", "update"));
			urlParameters.add(new BasicNameValuePair("id", "" + p.id));
			urlParameters.add(new BasicNameValuePair("fname", p.fname));
			urlParameters.add(new BasicNameValuePair("lname", p.lname));
			urlParameters.add(new BasicNameValuePair("age", "" + p.age));
			
			post.setEntity(new UrlEncodedFormEntity(urlParameters));

			HttpResponse response = client.execute(post);
			System.out.println("Response Code : "
			                + response.getStatusLine().getStatusCode());

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
			HttpClient client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(url);
			
			List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
			urlParameters.add(new BasicNameValuePair("cmd", "delete"));
			urlParameters.add(new BasicNameValuePair("id", "" + p.id));
			
			post.setEntity(new UrlEncodedFormEntity(urlParameters));

			HttpResponse response = client.execute(post);
			System.out.println("Response Code : "
			                + response.getStatusLine().getStatusCode());
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
