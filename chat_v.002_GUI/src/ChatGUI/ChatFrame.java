package ChatGUI;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ChatFrame extends JFrame 
{
	public ChatFrame()
	{
	setTitle("Chat");
	setBounds(100, 100, 400, 600);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	add (new ChatPanel());
	
	setVisible(true);
	}
}