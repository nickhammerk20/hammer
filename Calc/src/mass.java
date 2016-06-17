
public class mass {
	public static void main (String[] args)
	{
		double kg = 250;
		double res = funt(kg);
		System.out.println("Весс "+kg+" килограмм");
		System.out.println("соответсвует "+res+" фунтов");
		res = pud(kg);
		System.out.println("соответсвует "+res+" пудов");
		res = uncia(kg);
		System.out.println("соответсвует "+res+" унций");
		res = mane(kg);
		System.out.println("соответсвует "+res+" Манэ");
		res = shekel(kg);
		System.out.println("соответсвует "+res+" шекелей");
	}
	public static double funt (double x)
	{
		double res=(x/0.45359237);
		return res;
	}
	public static double pud (double x)
	{
		double res=(x/16.3804815);
		return res;
	}
	public static double uncia (double x)
	{
		double res=(x/0.028349523125);
		return res;
	}
	public static double mane (double x)
	{
		double res=(x/2.28);
		return res;
	}
	public static double shekel (double x)
	{
		double res=(x/0.014);
		return res;
	}
}
