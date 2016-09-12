
public class SeaMain 
{	
	public static void main(String[] args) 
	{
		Field sea = new Field();
		
		int[][] ini = { {1,0,0,1,1,1,0,0,0,0}, //3
						{0,0,0,1,1,1,0,0,1,0}, //5
						{0,1,0,1,1,1,0,0,0,0}, //5
						{0,0,0,1,1,1,0,0,0,1}};//3
						 
		int[][] ini1 = {{0,0,0,1,1,1,0,0,0,0}, //3
						{0,1,0,1,1,1,0,0,1,0}, //5
						{0,1,0,0,0,0,0,0,1,0}, //2
						{0,0,0,1,0,1,0,0,1,0}, //3
						{0,1,0,1,0,1,0,0,0,0}, //3
						{0,1,0,1,0,1,0,0,0,0}, //3
						{0,0,0,0,0,0,0,1,1,1}, //3
						{0,0,0,1,1,1,0,0,0,0}, //3
						{0,0,0,0,0,0,0,0,0,0},
						{0,0,0,1,1,1,0,0,0,0}};//3
		
		int[][] ini2 = {{0,0,0,1},
						{0,0,0,1},
						{0,0,0,0},
						{0,0,0,1}};
		
		sea.init(ini);
		System.out.println(sea.toString());
		System.out.println();
		System.out.println(sea.simple());
		System.out.println();
		System.out.println("   ==>> "+sea.arrayOfCheck());
		
	}
}
