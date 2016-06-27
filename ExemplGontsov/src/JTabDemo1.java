import javax.swing.*;
import java.awt.event.*;

public class JTabDemo1 {
	public static void main(String args[]) 
	{
		JFrame frame = new JFrame("JTabDemo1");
		// handle window close
		frame.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e) 
			{
				System.exit(0);
			}
		});
		// set up panels with buttons
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		panel1.add(new JButton("Button in panel 1 in tab 1"));
		panel2.add(new JButton("Button in panel 2 in tab 2"));
		// set up JTabbedPane object and add panels
		JTabbedPane jtp = new JTabbedPane();
		jtp.add("Tab 1", panel1);
		jtp.add("Tab 2", panel2);
		// display
		frame.getContentPane().add(jtp);
		frame.setLocation(200, 200);
		frame.pack();
		frame.setVisible(true);
	}
}