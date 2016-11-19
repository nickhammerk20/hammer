package dal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import com.sun.xml.internal.messaging.saaj.packaging.mime.Header;

//https://www.mkyong.com/java/apache-httpclient-examples/
public class httpmkyong_get 
{
	public httpmkyong_get() throws ClientProtocolException, IOException
	{
//		String url = "http://www.google.com/search?q=httpClient";
		String url = "http://localhost/myPERSON/personREAD_java.php";
//		String url = "http://localhost/myPERSON/personCREATE.php";
		

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);
//		System.out.println(request);
		// add request header
		//		request.addHeader("User-Agent" , "what");
//		request.addHeader("id", "5");
//		request.addHeader("fname", "fname5");
//		request.addHeader("lname", "lname5");
//		request.addHeader("age", "55");
//		System.out.println(request.);
		HttpResponse response = client.execute(request);
		
		System.out.println("Response Code : "
				+ response.getStatusLine().getStatusCode());

		BufferedReader rd = new BufferedReader(
				new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) 
		{
			System.out.println(line);
			result.append(line);
		}
	}
}