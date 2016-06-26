package view;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PPanel extends JPanel 
{

	public PPanel() 
	{
		setLayout(null);
		
		PersonDM dm = new PersonDM();
		JTable tbl = new JTable(dm);
		JScrollPane scr = new JScrollPane(tbl);
		scr.setBounds(10, 10, 400, 400);
		add( scr );
	}
}
