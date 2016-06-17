package HW1_arrays;
//�������� ������� ������ � ������ �������� �������, ��������, ��� ������� 1 2 3 4,
//��������� 3 4 1 2

public class HW_1_3_7{
	public static void main (String [] args){
		int [] r={50,10,7,30};
		for (int i = 0; i<=r.length-1; i++){
			System.out.print(r[i]+", ");
		}
		System.out.println();
		fArrHalfRevers(r);
		for (int i = 0; i<=r.length-1; i++){
			System.out.print(r[i]+", ");
		}
		System.out.println();
	}
	public static int fArrHalfRevers ( int [] a ) {
		if (a==null || a.length==0 || a.length%2!=0) {
			throw new IllegalArgumentException();
		}
		int ret = a.length/2; //�� ���������� ��� �������� ��� �����, ��� ����� ������
		for (int i=0; ret>i ; i++){
			int temp = a[i]; 
			a[i] = a[ret + i];
			a[ret + i] = temp; 
		}			
		System.out.println();
		return ret; //�� ���������� ��� �������� ��� �����, ��� ����� ������
	
	}
}