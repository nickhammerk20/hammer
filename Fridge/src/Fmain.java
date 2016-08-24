
public class Fmain 
{
	public static void main(String[] args) 
	{
		Fridge fr = new Fridge();
		boolean [][] bb = {{true,true,true,true},{false,false,false,true},{false,false,false,true},{true,false,false,true}};
		fr.init( bb );
		System.out.println( fr );
		Unlocker uu = new Unlocker();
		uu.calc(fr);
		System.out.println( uu );
	}
}
