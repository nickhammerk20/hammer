package HW1_Cycles;
// ��������� ����� ���� ��������� �����

public class HW_1_2_5{
	public static void main (String [] args){
		int r=3456789;
		int res=fsumcifr(r);
		System.out.println("�� ������  "+res);
	}
	public static int fsumcifr(int a){
		if (a<=0) { //���� ����� ������ "0" �� ������ ������
			throw new IllegalArgumentException();
		}
		int ret=0;
		int count = (int)Math.log10(a)+1;
		if ( count == 1 ){ // ���� � ��������� ����� 1 ���� �� = �����
			ret=a;
		}
		else { // ����� ����� ���������� � ���� �����
			int b = 1;
			int ret1=0;
			int ret2=0;
			for( int i = count; i >= 1; i--){
				ret1 = a/b;
				b*=10;
				ret2 = ret1%10;
				ret+=ret2;
				System.out.println(ret+" bubu "+b);
			}			
		}
		
		return ret;
	}
}