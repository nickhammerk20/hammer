
public class mass {
	public static void main (String[] args)
	{
		double kg = 250;
		double res = funt(kg);
		System.out.println("���� "+kg+" ���������");
		System.out.println("������������ "+res+" ������");
		res = pud(kg);
		System.out.println("������������ "+res+" �����");
		res = uncia(kg);
		System.out.println("������������ "+res+" �����");
		res = mane(kg);
		System.out.println("������������ "+res+" ����");
		res = shekel(kg);
		System.out.println("������������ "+res+" �������");
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
