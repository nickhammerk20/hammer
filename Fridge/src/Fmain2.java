
public class Fmain2 
{
	public static void main(String[] args) 
	{
		Fridge fr = new Fridge();
//		boolean [][] bb = {{true,true,true,true},{false,false,false,true},{false,false,false,true},{false,false,false,true}};
		boolean [][] bb = {{true,true,true,true},{true,false,false,false},{true,false,false,false},{true,false,false,false}};
		fr.init( bb );
		System.out.println( fr );
		fr.turn(2);
		System.out.println();
		System.out.println( fr );
		fr.turn(1);
		System.out.println();
		System.out.println( fr );
		fr.turn(15);
		System.out.println();
		System.out.println( fr );
		fr.turn(2);
		System.out.println();
		System.out.println( fr );
	}
}
