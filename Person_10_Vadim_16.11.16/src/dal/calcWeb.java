package dal;

import java.io.IOException;

import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Form;
import org.apache.http.client.fluent.Request;

public class calcWeb 
{
	public static int calcWeb(int a, int b, char op)
	{
		int ret = 0;

		try 
		{
			Form frm =  Form.form();
			frm.add("aNum", "" + a);
			frm.add("bNum", "" + b);
			frm.add("oPa",  "" + op);
			Content io = Request.Post("http://localhost/myCALC/calc_vadim.php").bodyForm(frm.build()).execute().returnContent();
			System.out.println( io.asString() );
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

		return ret;
	}
	
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 5000;
		char op = '*';
		calcWeb(a,b,op);
	}
}
