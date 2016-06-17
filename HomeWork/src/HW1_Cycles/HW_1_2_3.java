package HW1_Cycles;
// ����� ������ ������������ ����� � ��������� �� ������ (����������� �������
// ����������������� ������� � ����� ��������� ������)

public class HW_1_2_3{
	public static void main (String [] args){
		int r=138384;
		int res=fkorennatchisla(r);
		System.out.println(res);
	}
	public static int fkorennatchisla(int a){ // ����� �������
		if (a<=0) { //���� ����� ������ "0" �� ������ ������
			throw new IllegalArgumentException();}
		int ret = 0;
		for( int i = 1 ; ret==0; i++){
			if ( (i * i) >= a){
				ret = i--;
			}
		}
			
		return ret;
	}
	
	
	public static int fkorennatchisla000(int a){ // �� �������
		if (a<=0) { //���� ����� ������ "0" �� ������ ������
			throw new IllegalArgumentException();}
		double ret=1;
		if(a>=100){
			int count = (int)Math.log10(a)-1;
			ret=a/Math.pow(10, count);
			for(int b=9; b == 1; b--){
				// ����� ��� ������� ����...
			}
		}
		else{
			ret=a;	
		}
		int rez = (int) ret;
		return rez;
	}
}