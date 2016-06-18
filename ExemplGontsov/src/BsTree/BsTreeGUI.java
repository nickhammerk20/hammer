package BsTree;

import java.awt.Graphics2D;

public class BsTreeGUI extends BsTree 
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
			int xLine = ( (right + left)/2 );
			int yLine = ( dy * ( level - 1 ) + 30);
			grap.drawLine(x+15, y+30, xLine, yLine);
		}
//		if (level != 1)
//		{
//			if(p.val < 25)
//			{
//			int yLine = ( dy * ( level - 1 ) + 30);
//			int xLine = ( (right - left)+ 15 );
//			System.out.println("p.val= " + p.val + ", xLine= " + xLine+ ", yLine= "  +  yLine + ", x= " + x + ", y= " +  y);
//			grap.drawLine(xLine, yLine, x+14, y);
//			}
//		}				
		//System.out.print(p.val + ",");
		/*Vertex = END  */
			
		printNodeGUI(p.left, 	grap, 	left , 	x , 	level+1,	dy);          		//Left
		printNodeGUI(p.right,	grap,  	x , 	right, 	level+1, 	dy);             	//Right
	}

}
  