import java.util.ArrayList;

public class Fridge implements Cloneable
{
	boolean[][] bb = new boolean [4][4];
	ArrayList<Integer> lst = new ArrayList<Integer>();
	public void turn(int pos) // диапазон от 1 до 16 
	{
		lst.add(pos);
		pos--;
		int i = pos / 4;
		int j = pos % 4;
		for (int ii = 0; ii < 4; ii++) 
		{
			bb[ii][j] = !bb[ii][j];
		}
		for (int jj = 0; jj < 4; jj++) 
		{
			bb[i][jj] = !bb[i][jj];
		}
		bb[i][j] = !bb[i][j];
	}
	public boolean check()
	{
		boolean flag = true;
		m1:
		for (int i = 0; i < 4; i++) 
		{
			for (int j = 0; j < 4; j++) 
			{
				if(bb[i][j])
				{
					flag = false;
					break m1;
				}
			}
		}		
		return flag;
	}
	public void init(boolean[][] bb)
	{
		this.bb = bb.clone();
	}
	@Override
	public String toString() 
	{
		String str = "";
		for (int i = 0; i < 4; i++) 
		{
			for (int j = 0; j < 4; j++) 
			{
				str += bb[i][j] + " ";
			}
			str += "\n";
		}
		return str;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		Fridge ret = new Fridge();
		ret.bb = bb.clone();
		ret.lst = (ArrayList<Integer>) lst.clone();
		return ret;
	}
}
