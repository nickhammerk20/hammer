import javax.swing.*;
public class HW_20160420_1 {

	public static void main(String[] args) {
		// 4 класса, на каждый по 5 функций (метр, градус, объем, вес)
		double metr, jard, fut, link, mile, duim; //изм. расстояния
		double cels, farengeit, kelvin, njuton, rankin, delilu; //изм. температур
		double litr, gallon, pinta, barrel, kvarta, kubduim; //изм. объема
		double gram, pud, funt, uncia, mane, shekel; //изм веса
		metr=Double.parseDouble(JOptionPane.showInputDialog("Укажите длину в метрах:"));
		cels=Double.parseDouble(JOptionPane.showInputDialog("Укажите температуру в градусах цельсия:"));
		litr=Double.parseDouble(JOptionPane.showInputDialog("Укажите объем в литрах:"));
		gram=Double.parseDouble(JOptionPane.showInputDialog("Укажите вес в граммах:"));
		String text="Указанные величины в других системах измерения соответсвуют следующим единицам: \n";
		String strmetr="Расстояние: "+metr+"м. = ";
		String strcels="Температура: "+cels+"С. = ";
		String strlitr="Объем: "+litr+"литр. = ";
		String strgram="Вес: "+gram+"гр. = ";
		// перевод расстояния
			jard=(metr/0.9144); // 1 Ярд = 91,44 см
				jard=jard*100;
				int i = (int) (jard);
				jard= (double)i/100;
			fut=metr/0.3048; // 1 Фут = 30,48 см
				fut=fut*100;
				i = (int) (fut);
				fut= (double)i/100;
			link=metr/0.201168; // 1 Линк = 20,1168 см
				link=link*100;
				i = (int) (link);
				link= (double)i/100;
			mile=metr/1609.344; // 1 Миля = 1,609344 км = 1609.344мет
				mile=mile*1000;
				i = (int) (mile);
				mile= (double)i/1000;
			duim=metr/0.0254; //1 Дюйм = 2,54 см = 0,0254 метра
				duim=duim*100;
				i = (int) (duim);
				duim= (double)i/100;
			
		// перевод температур
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
			
		// перевод объема
			gallon=litr/3.78541178; // Американский галлон равен 3,78541178 литра
				gallon=gallon*100;
				i = (int) (gallon);
				gallon= (double)i/100;
			pinta=litr*1000/473.176473; //1 американская пинта = 473,176473 миллилитра)
				pinta=pinta*100;
				i = (int) (pinta);
				pinta= (double)i/100;
			barrel=litr/158.988; //Америкнский нефтянй бррель — единица измерения объёма нефти, равная 42 галлонам или 158,988 литрам.
				barrel=barrel*1000;
				i = (int) (barrel);
				barrel= (double)i/1000;
			kvarta=gallon/4; //1 кварта = 2 пинты = 1/4 галлона.
				kvarta=fut*100;
				i = (int) (kvarta);
				kvarta= (double)i/100;
			kubduim=litr*100/2.54; // равный 2,54 см.
				kubduim=kubduim*100;
				i = (int) (kubduim);
				kubduim= (double)i/100;

		// перевод веса
			pud=gram/1000/16.3804815; //Пуд = 1/10 берковца = 40 фунтам = 1280 лотам = 3840 золотникам = 368 640 долям = 16,3804815 кг
				pud=pud*10000;
				i = (int) (pud);
				pud= (double)i/10000;
			funt=gram/453.59237; //фунт — 453,59237 г (точное и официальное значение) 
				funt=funt*100;
				i = (int) (funt);
				funt= (double)i/100;
			uncia=gram/28.349523125; //Унция — 1/16 фунта, или 1/224 стоуна, или 28,349523125 г
				uncia=uncia*100;
				i = (int) (uncia);
				uncia= (double)i/100;
			mane=gram/1000/2.28; //Манэ = 2,28 кг
				mane=mane*100;
				i = (int) (mane);
				mane= (double)i/100;
			shekel=gram/14; //Шекель = 14 г
				shekel=shekel*100;
				i = (int) (shekel);
				shekel= (double)i/100;
		//вывод результата
		text+=strmetr+jard+"Ярдов, "+fut+"Футов = "+link+"Линков = "+mile+"Миль = "+duim+"Дюймов.\n";
		text+=strcels+farengeit+"F = "+kelvin+"K = "+njuton+"N = "+rankin+"Ra = "+delilu+"D.\n";
		text+=strlitr+gallon+"галлон = "+pinta+"пинта = "+barrel+"баррель = "+kvarta+"кварта = "+kubduim+"кубических дюймов.\n";
		text+=strgram+pud+"Пуд = "+funt+"Фунтов = "+uncia+"Унций = "+mane+"Манэ = "+shekel+"Шекель.";
		JOptionPane.showMessageDialog(null, text);
	}

}
