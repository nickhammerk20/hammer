
public class temp {
	public static void main (String[] args)
	{
		double cels = 40;
		double res = faring(cels);
		System.out.println("����������� "+cels+" �������� �������");
		System.out.println("������������ "+res+" �� �������� ����������");
		res = kelvin(cels);
		System.out.println("������������ "+res+" �������� �������");
		res = njuton(cels);
		System.out.println("������������ "+res+" �������� �������");
		res = rankin(cels);
		System.out.println("������������ "+res+" �������� �������");
		res = guk(cels);
		System.out.println("������������ "+res+" �������� ����");
	}
	public static double faring (double x)
	{
		double res=(1.8*x+32);
		return res;
	}
	public static double kelvin (double x)
	{
		double res=(x+273.15);
		return res;
	}
	public static double njuton (double x)
	{
		double res=(0.33*x);
		return res;
	}
	public static double rankin (double x)
	{
		double res=((1.8*x+32)+459.67);
		return res;
	}
	public static double guk (double x)
	{
		double res=((5.0/12.0)*x);
		return res;
	}
}
