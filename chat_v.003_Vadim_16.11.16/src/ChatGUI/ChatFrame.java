package ChatGUI;

import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ChatFrame extends JFrame 
{
	public ChatFrame() throws UnknownHostException, IOException
	{
	setTitle("Chat");
	setBounds(100, 100, 400, 600);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	add (new ChatPanel());
	
	setVisible(true);
	}
}
