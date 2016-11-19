package dal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Form;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
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
		// work on Vadim example
		try {					
			Form frm =  Form.form();
			frm.add("id", "" + p.id);
			frm.add("fname", "" + p.fname);
			frm.add("lname",  "" + p.lname);
			frm.add("age",  "" + p.age);
			Content io = Request.Post("http://localhost/myPERSON/personCREATE_java.php").bodyForm(frm.build()).execute().returnContent();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Person> read() 
	{
		//example from https://www.mkyong.com/java/apache-httpclient-examples/
		ArrayList<Person> pp = null;
		try {
			String url = "http://localhost/myPERSON/personREAD_json.php";

			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(url);
			HttpResponse response = client.execute(request);

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
		try
		{
			HttpClient client = HttpClientBuilder.create().build();

			String url = "http://localhost/myPERSON/personUpdate_java_php.php?id=" + 
					p.id + "&fname=" + p.fname + "&lname=" 
					+ p.lname + "&age=" + p.age;
			
			HttpGet request = new HttpGet(url);

			HttpResponse response;
			
			response = client.execute(request);

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

			String url = "http://localhost/myPERSON/personDelete_java_php.php?id=" + p.id;
			
			HttpGet request = new HttpGet(url);
			client.execute(request);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
