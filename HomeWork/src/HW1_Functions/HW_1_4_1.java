package HW1_Functions;
//1. �������� ��������� �������� ��� ������ �� ������ ���.

public class HW_1_4_1{
	public static void main (String [] args){
		int r=0;
		String res=fdayweek(r);
		System.out.println(res);
	}
	public static String fdayweek(int a){
		if (a<=0 || a>=8) {
			throw new IllegalArgumentException();
		}
		String [] dayweek = {"","�����������","�������","�����","�������","�������","�������","�����������"} ;
		String ret = dayweek[a];
		return ret;
	}
}