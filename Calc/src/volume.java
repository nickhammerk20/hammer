
public class volume {

	public static void main(String[] args) 
	{
		double litr=50;
		double res=barell(litr);
		System.out.println("Указанный объем: "+litr+" литров, \nсоответсвует:");
		System.out.println(res+" барель,");
		res=galon(litr);
		System.out.println(res+" галонов,");
		res=pinta(litr);
		System.out.println(res+" пинт,");
		res=kvarta(litr);
		System.out.println(res+" кварты,");
		res=kubduim(litr);
		System.out.println(res+" кубических дюймов.");
	}
	public static double barell (double x)
	{
		double res = x/158.983;
		return res;
	}
	public static double galon (double x)
	{
		double res = x/3.78541178;
		return res;
	}
	public static double pinta (double x)
	{
		double res = x/0.473176473;
		return res;
	}
	public static double kvarta (double x)
	{
		double res = x/0.9463; //1 американская кварта для жидкостей = 0,9463 л.
		return res;
	}
	public static double kubduim (double x)
	{
		double res = x/0.0254;
		return res;
	}
}
