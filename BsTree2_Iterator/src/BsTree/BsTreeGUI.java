package BsTree;

import java.awt.Graphics2D;


public class BsTreeGUI extends BsTree4_AVL_Visitor//BsTree4_AVL_Visitor BsTree1_Rotation
{
	public void printGUI(Graphics2D grap, int right) 
	{
		printNodeGUI(root, grap, 0 , right, 1 , 50);
	}
	private void printNodeGUI(Node p, Graphics2D grap, int left , int right, int level , int dy) 
	{
		if (p == null)
			return;

		/*Vertex = START */
		int x = (left+right)/2;
		int y = dy * level;
		grap.drawString("" + p.val, x+7, y+20);	
		grap.drawOval(x, y, 30, 30);

		if (p.left != null)
		{
			int xLine = ( (left + x)/2+15 );
			int yLine = ( dy * ( level + 1 ));
			grap.drawLine(xLine, yLine, x+15, y+30);
		}
		if (p.right != null)
		{
			int xLine = ( (right + x)/2+15 );
			int yLine = ( dy * ( level + 1 ));
			grap.drawLine(xLine, yLine, x+15, y+30);
		}
		/*Vertex = END  */

		printNodeGUI(p.left, 	grap, 	left , 	x , 	level+1,	dy);          		//Left
		printNodeGUI(p.right,	grap,  	x , 	right, 	level+1, 	dy);             	//Right
	}
}
