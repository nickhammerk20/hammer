import javax.swing.*;
public class HW_20160420_1 {

	public static void main(String[] args) {
		// 4 ������, �� ������ �� 5 ������� (����, ������, �����, ���)
		double metr, jard, fut, link, mile, duim; //���. ����������
		double cels, farengeit, kelvin, njuton, rankin, delilu; //���. ����������
		double litr, gallon, pinta, barrel, kvarta, kubduim; //���. ������
		double gram, pud, funt, uncia, mane, shekel; //��� ����
		metr=Double.parseDouble(JOptionPane.showInputDialog("������� ����� � ������:"));
		cels=Double.parseDouble(JOptionPane.showInputDialog("������� ����������� � �������� �������:"));
		litr=Double.parseDouble(JOptionPane.showInputDialog("������� ����� � ������:"));
		gram=Double.parseDouble(JOptionPane.showInputDialog("������� ��� � �������:"));
		String text="��������� �������� � ������ �������� ��������� ������������ ��������� ��������: \n";
		String strmetr="����������: "+metr+"�. = ";
		String strcels="�����������: "+cels+"�. = ";
		String strlitr="�����: "+litr+"����. = ";
		String strgram="���: "+gram+"��. = ";
		// ������� ����������
			jard=(metr/0.9144); // 1 ��� = 91,44 ��
				jard=jard*100;
				int i = (int) (jard);
				jard= (double)i/100;
			fut=metr/0.3048; // 1 ��� = 30,48 ��
				fut=fut*100;
				i = (int) (fut);
				fut= (double)i/100;
			link=metr/0.201168; // 1 ���� = 20,1168 ��
				link=link*100;
				i = (int) (link);
				link= (double)i/100;
			mile=metr/1609.344; // 1 ���� = 1,609344 �� = 1609.344���
				mile=mile*1000;
				i = (int) (mile);
				mile= (double)i/1000;
			duim=metr/0.0254; //1 ���� = 2,54 �� = 0,0254 �����
				duim=duim*100;
				i = (int) (duim);
				duim= (double)i/100;
			
		// ������� ����������
			farengeit=(9.0/5.0*cels)+32;
				farengeit+=32;
				farengeit=farengeit*100; 
				i = (int) (farengeit);
				farengeit= (double)i/100;
			kelvin=(cels/40.0*313.15) ;
				kelvin=kelvin*10;
				i = (int) (kelvin);
				kelvin= (double)i/10;
			njuton=(33.0/100.0);
				njuton=njuton*cels;
				njuton=njuton*1000;
				i = (int) (njuton);
				njuton= (double)i/1000;
			rankin=(farengeit+459.67);
				rankin=rankin*10;
				i = (int) (rankin);
				rankin= (double)i/10;
			delilu=100-cels;
				delilu=delilu*3.0/2.0;
				delilu=delilu*10;
				i = (int) (delilu);
				delilu= (double)i/10;
			
		// ������� ������
			gallon=litr/3.78541178; // ������������ ������ ����� 3,78541178 �����
				gallon=gallon*100;
				i = (int) (gallon);
				gallon= (double)i/100;
			pinta=litr*1000/473.176473; //1 ������������ ����� = 473,176473 ����������)
				pinta=pinta*100;
				i = (int) (pinta);
				pinta= (double)i/100;
			barrel=litr/158.988; //����������� ������� ������ � ������� ��������� ������ �����, ������ 42 �������� ��� 158,988 ������.
				barrel=barrel*1000;
				i = (int) (barrel);
				barrel= (double)i/1000;
			kvarta=gallon/4; //1 ������ = 2 ����� = 1/4 �������.
				kvarta=fut*100;
				i = (int) (kvarta);
				kvarta= (double)i/100;
			kubduim=litr*100/2.54; // ������ 2,54 ��.
				kubduim=kubduim*100;
				i = (int) (kubduim);
				kubduim= (double)i/100;

		// ������� ����
			pud=gram/1000/16.3804815; //��� = 1/10 �������� = 40 ������ = 1280 ����� = 3840 ���������� = 368 640 ����� = 16,3804815 ��
				pud=pud*10000;
				i = (int) (pud);
				pud= (double)i/10000;
			funt=gram/453.59237; //���� � 453,59237 � (������ � ����������� ��������) 
				funt=funt*100;
				i = (int) (funt);
				funt= (double)i/100;
			uncia=gram/28.349523125; //����� � 1/16 �����, ��� 1/224 ������, ��� 28,349523125 �
				uncia=uncia*100;
				i = (int) (uncia);
				uncia= (double)i/100;
			mane=gram/1000/2.28; //���� = 2,28 ��
				mane=mane*100;
				i = (int) (mane);
				mane= (double)i/100;
			shekel=gram/14; //������ = 14 �
				shekel=shekel*100;
				i = (int) (shekel);
				shekel= (double)i/100;
		//����� ����������
		text+=strmetr+jard+"�����, "+fut+"����� = "+link+"������ = "+mile+"���� = "+duim+"������.\n";
		text+=strcels+farengeit+"F = "+kelvin+"K = "+njuton+"N = "+rankin+"Ra = "+delilu+"D.\n";
		text+=strlitr+gallon+"������ = "+pinta+"����� = "+barrel+"������� = "+kvarta+"������ = "+kubduim+"���������� ������.\n";
		text+=strgram+pud+"��� = "+funt+"������ = "+uncia+"����� = "+mane+"���� = "+shekel+"������.";
		JOptionPane.showMessageDialog(null, text);
	}

}
