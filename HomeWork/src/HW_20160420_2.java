public class HW_20160420_2 {

	public static void main(String[] args) {
	// ����������� �������
		for(int i=1;i<=7; i++){
			for(int j=1;j<=7; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	
	//������ �������
		System.out.println();
		for(int i=1;i<=7; i++)
		{
			for(int j=1;j<=7; j++)
			{
				if(j==1 || i==1 || j==7 || i==7)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
		
		//����������� 1
		System.out.println();
		for(int i=1;i<=7; i++) //������
		{
			for(int j=1;j<=7; j++) //�������
			{
				if(j==1 || i==7 || i==j)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}	
		
		//����������� 2
		System.out.println();
		for(int i=1;i<=7; i++) //������
		{
			for(int j=1;j<=7; j++) //�������
			{
				if(j==1 || i==1 || j+i==8)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}	
		
		//����������� 3
		System.out.println();
		for(int i=1;i<=7; i++) //������
		{
			for(int j=1;j<=7; j++) //�������
			{
				if(j==7 || i==1 || i==j)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}	
		
		//����������� 4
		System.out.println();
		for(int i=1;i<=7; i++) //������
		{
			for(int j=1;j<=7; j++) //�������
			{
				if(j==7 || i==7 || j+i==8)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
		// ����� "�"
		System.out.println();
		for(int i=1;i<=7; i++) //������
		{
			for(int j=1;j<=7; j++) //�������
			{
				if(j==i || j+i==8)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}	
		// ��������� ����������� "������"
		System.out.println();
		for(int i=1;i<=7; i++) //������
		{
			for(int j=1;j<=4; j++) //�������
			{
				if(j==1 || j==i || j+i==8 )
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}	
		
		// ��������� ����������� "����"
		System.out.println();
		for(int i=1;i<=4; i++) //������
		{
			for(int j=1;j<=7; j++) //�������
			{
				if(i==1 || j==i || j+i==8 )
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}	
		
		// ��������� ����������� "�����"
		System.out.println();
		for(int i=4;i<=7; i++) //������
		{
			for(int j=1;j<=7; j++) //�������
			{
				if(i==7 || j==i || j+i==8)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}	
		// ��������� ����������� "������"
		System.out.println();
		for(int i=1;i<=7; i++) //������
		{
			for(int j=4;j<=7; j++) //�������
			{
				if(j==7 || j==i || j+i==8)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
		
		// ������� ��������� ������� ��������� 1,2,3,4,5,6,7
		System.out.println();
		for(int i=1;i<=7; i++) //������
		{
			for(int j=1;j<=7; j++) //�������
			{
				System.out.print(i);
			}
		System.out.println();
		}
		// ������� ��������� ������� ���������� 1,2,3,4,5,6,7
		System.out.println();
		for(int i=1;i<=7; i++) //������
		{
			for(int j=1;j<=7; j++) //�������
			{
				System.out.print(j);
			}
		System.out.println();
		}	
		// ������� ��������� ������� ��������� 7,6,5,4,3,2,1
		System.out.println();
		for(int i=1;i<=7; i++) //������
		{
			for(int j=1;j<=7; j++) //�������
			{
				System.out.print(8-i);
			}
		System.out.println();
		}
		// ������� ��������� ������� ���������� 7,6,5,4,3,2,1
		System.out.println();
		for(int i=1;i<=7; i++) //������
		{
			for(int j=1;j<=7; j++) //�������
			{
				System.out.print(8-j);
			}
		System.out.println();
		}	
	}
}