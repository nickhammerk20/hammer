import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class serverMain {

	public static void main(String[] args) 
	{
		try 
		{
			ServerSocket ss = new ServerSocket(777);
			while(true)
			{
				Socket cs = ss.accept();
			}
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}

}
