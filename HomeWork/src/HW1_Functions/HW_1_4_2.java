package HW1_Functions;
// ������ ����� (0�999), �������� ������ � �������� �����.

public class HW_1_4_2{
	public static void main (String [] args){
		int r=998;
		String res=fChisloToPropis(r);
		System.out.println(res);
	}
	public static String fChisloToPropis(int r){
		if (r<0) {
			throw new IllegalArgumentException();
		}
		String [] one = {"����","����","���","���","������","����","�����","����","������","������"};
		String [] eleven = {"������","�����������","����������","����������","������������","�����������","������������", "�����������", "�������������", "�������������"};
		String [] ten = {"","������","��������","��������","�����","���������","����������","���������","�����������","���������"};
		String [] hundred = {"","���","������","������","���������","�������","��������","�������","���������","���������"};
		String ret = "";
		int a = r/100;
		int b = (r%100)/10;
		int c = r%10;
		
//		System.out.println("a = "+a+" b = "+b+" c = "+c+" ret = "+ret);
		if( (a + b + c) == 0 ){ // "������� �������� "
			ret = one[c];
//			System.out.println("������� �������� "+"a = "+a+" b = "+b+" c = "+c+" ret = "+ret);
			}
		else if (r<10){ //  "�������� �� 0 �� 9 "
			ret = one[c];
//			System.out.println("�������� �� 0 �� 9 "+"a = "+a+" b = "+b+" c = "+c+" ret = "+ret);
		}
		else if (r >= 10 && r <= 19){ //  "�������� �� 10 �� 19 "
			ret = eleven[c];
//			System.out.println("�������� �� 10 �� 19 "+"a = "+a+" b = "+b+" c = "+c+" ret = "+ret);
			}
		else if ( a==0 && b!= 0 & c == 0 ){// "������� ������� "
			ret = ten[b];
//			System.out.println("������� ������� "+"a = "+a+" b = "+b+" c = "+c+" ret = "+ret);
			}
		else if ( a== 0 && b!= 0 && c != 0 ){// "��������� ������� "
			ret = ten[b];
			ret+= " "+one[c];
//			System.out.println("��������� ������� "+"a = "+a+" b = "+b+" c = "+c+" ret = "+ret);
			}
		else if (r >= 100 && ( b + c ) == 0){ // "������� ����� "
			ret = hundred[a];
//			System.out.println("������� ����� "+"a = "+a+" b = "+b+" c = "+c+" ret = "+ret);
		}
		else if (r >= 100 && b == 0 && c >= 1 && c <= 9 ){ //"����� � �� 1 �� 9 "
			ret = hundred[a];
			ret+= " "+one[c];
//			System.out.println("����� � �� 1 �� 9 "+"a = "+a+" b = "+b+" c = "+c+" ret = "+ret);
		}
		else if (r >= 100 && b == 1 && c !=0 ){  // "����� � ����������� "
			ret = hundred[a];
			ret+= " "+eleven[c];
//			System.out.println("����� � ����������� "+"a = "+a+" b = "+b+" c = "+c+" ret = "+ret);
		}
		else if (r >= 100 && b > 0 && c ==0 ){  // "����� � ������� ������� "
			ret = hundred[a];
			ret+= " "+ten[b];
//			System.out.println("����� � ������� ������� "+"a = "+a+" b = "+b+" c = "+c+" ret = "+ret);
		}
		else if (r >= 100 && b > 1 && c !=0 ){  // "����� � ��������� "
			ret = hundred[a];
			ret+= " "+ten[b];
			ret+= " "+one[c];
//			System.out.println("����� � ��������� "+"a = "+a+" b = "+b+" c = "+c+" ret = "+ret);
		}

		else if (a == 0 ){
			ret = hundred[a] + " " + ret; 
		}
		
		return ret;
	}
}