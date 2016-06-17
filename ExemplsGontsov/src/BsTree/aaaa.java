package BsTree;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
class aaaa  //extends JFrame{
{ 
	void Tree(String s){
		DefaultMutableTreeNode root=new DefaultMutableTreeNode("Корень");
		JTree tr = new JTree(root);
		JScrollPane sp=new JScrollPane(tr);
		// tr.setVisibleRowCount(8);
		//super(s);
		//getContentPane().setBackground(Color.WHITE);
		//setSize(400,150);
		//setVisible(true);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void paint(Graphics g){
		g.setFont(new Font("Serif",Font.ITALIC|Font.BOLD,30));
		g.drawString("Hello", 20, 100);
	}

	public static void main(String[] args){
		new Tree("Моя прога");
	}
}