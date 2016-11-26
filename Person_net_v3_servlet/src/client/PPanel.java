package client;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PPanel extends JPanel 
{
	public String setID = "";
	public int realRow;
	public JTable tbl = null;
	
	public PPanel() 
	{
		setLayout(null);
		
		PersonDM dm = new PersonDM(this);
		tbl = new JTable(dm);
		tbl.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if (e.getClickCount() == 1)
				{
					int row = tbl.rowAtPoint(e.getPoint());
		            if (row > -1)
		            {
		                realRow = tbl.convertRowIndexToModel(row);
		                dm.row = realRow;
		                setID = "" + tbl.getValueAt(realRow, 0);		                
		            }
				}
			}
		});
		JScrollPane scr = new JScrollPane(tbl);
		scr.setBounds(10, 10, 400, 540);
		add( scr );
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setBounds(440, 40, 110 , 25);
		JButton btnRead = new JButton("Read");
		btnRead.setBounds(440, 80, 110 , 25);
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(440, 120, 110 , 25);
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(440, 160, 110 , 25);
		
		btnCreate.addActionListener(dm.aCreate);
		btnRead.addActionListener(dm.aRead);
		btnUpdate.addActionListener(dm.aUpdate);
		btnDelete.addActionListener(dm.aDelete);
		
		add(btnCreate);
		add(btnRead);
		add(btnUpdate);
		add(btnDelete);
			
	}
}
