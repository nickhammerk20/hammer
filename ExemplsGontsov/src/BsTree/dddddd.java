package BsTree;
import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
class dddddd extends JFrame
{
	void PascalTriangl(String s)
	{

		DefaultMutableTreeNode root=new DefaultMutableTreeNode("������");

		JTree tr = new JTree(root);
		JScrollPane sp=new JScrollPane(tr);
		add(sp);
		tr.setVisibleRowCount(8);
		DefaultMutableTreeNode subtree1=new DefaultMutableTreeNode("����1");

		root.add(subtree1);
		subtree1.add(new DefaultMutableTreeNode("���� 2�"));
		root.add(new DefaultMutableTreeNode("���� 1"));
		// super(s);
		getContentPane().setBackground(Color.WHITE);
		setSize(400,150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args)
	{
		BsTree.PascalTriangl pascalTriangl = new PascalTriangl("��� �����");
	}
}