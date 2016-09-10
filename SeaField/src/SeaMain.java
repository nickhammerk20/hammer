
public class SeaMain 
{	
	public static void main(String[] args) 
	{
		Field sea = new Field();
	
		
		int[][] ini = {	{0,0,0,1,1,1,0,0,0,0},
						{0,1,0,1,1,1,0,0,1,0},
						{0,1,0,0,0,0,0,0,1,0},
						{0,0,0,1,0,1,0,0,1,0},
						{0,1,0,1,0,1,0,0,0,0},
						{0,1,0,1,0,1,0,0,0,0},
						{0,0,0,0,0,0,0,1,1,1},
						{0,0,0,1,1,1,0,0,0,0},
						{0,0,0,0,0,0,0,0,0,0},
						{0,0,0,1,1,1,0,0,0,0}};
		sea.init(ini);
		System.out.println(sea.toString());
		System.out.println();
		System.out.println(sea.simple());
		
		
	}
}
