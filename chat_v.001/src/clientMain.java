import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class clientMain 
{
	public static void main(String[] args) 
	{
		try
		{
			Socket cs = new Socket("127.0.0.1", 777);
			InputStream in = cs.getInputStream();
			OutputStream out = cs.getOutputStream();
			Scanner cc = new Scanner(System.in);

			String str = "";
			while(true)
			{
				DataInputStream r = new DataInputStream(in);
				DataOutputStream w = new DataOutputStream(out);
				w.writeUTF(str);
				w.flush();

				System.out.println(r.readUTF());
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}		
	}
}
