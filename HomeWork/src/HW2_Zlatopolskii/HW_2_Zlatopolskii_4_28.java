package HW2_Zlatopolskii;
//���� ����������� �����. ����������, ����� �� ��� ���� ������:
//�) ������ ��� ���������;
//�) ������ ��� ������;
//�) ������ ��� ���������.
public class HW_2_Zlatopolskii_4_28{
	public static void main (String [] args){
		int r=642;
		String resa=fwhatbiga(r);
		String resb=fwhatbigb(r);
		String resc=fwhatbigc(r);
		System.out.println("a = "+resa+" � = "+resb+" � = "+resc);
	}
	public static String fwhatbiga(int r){
		int a = r/100;
		int c = r%10;
		if (r == 0 || a == c) {
			throw new IllegalArgumentException();
		}
		String ret="";
			ret = (a > c) ? "������" : "���������";
//		System.out.println(a+" "+b+" "+c+ " ��� = "+ret);
		return ret;
	}
	public static String fwhatbigb(int r){
		int a = r/100;
		int b = (r%100)/10;
		if (r == 0 || a == b) {
			throw new IllegalArgumentException();
		}
		String ret="";
			ret = (a > b) ? "������" : "������";
//		System.out.println(a+" "+b+" "+c+ " ��� = "+ret);
		return ret;
	}
	public static String fwhatbigc(int r){
		int b = (r%100)/10;
		int c = r%10;
		if (r == 0 || b == c) {
			throw new IllegalArgumentException();
		}
		String ret="";
			ret = (b > c) ? "������" : "���������";
		System.out.println(b+" "+c+ " ��� = "+ret);
		return ret;
	}
}