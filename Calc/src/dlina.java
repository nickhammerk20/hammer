// ��������� ���������

public class dlina{
	public static void main(String [] args)
	{
		double km=100;
		double res=mile(km);
		System.out.println("�����: "+km+"��. \n�����:");
		System.out.println(res+" ����,");
		res=jard(km);
		System.out.println(res+" �����,");
		res=fut(km);
		System.out.println(res+" �����,");
		res=duim(km);
		System.out.println(res+" ������,");
		res=link(km);
		System.out.println(res+" ������.");
	}
	public static double mile (double x)
	{
		double ret=x/1.609344;
		return ret;
	}
	public static double jard (double x)
	{
		
		double ret=x/0.09144;
		return ret;
	}
	public static double fut (double x)
	{
		
		double ret=x/0.03048;
		return ret;
	}
	public static double duim (double x)
	{
		
		double ret=x/0.00254;
		return ret;
	}
	public static double link (double x)
	{
		
		double ret=x/0.00201168;
		return ret;
	}
}
