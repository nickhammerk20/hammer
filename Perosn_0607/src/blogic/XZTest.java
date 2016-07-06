package blogic;

import java.lang.reflect.Field;
import java.util.ArrayList;

import dal.PersonDAO;
import dal.PersonDAO_Mock;

public class XZTest
{
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException 
	{
		//Person p  = new Person(10, "Vasia", "Pupkin", 23, "35634563sxvxcv");
		//Class cc = p.getClass();

		//Field[] ff = cc.getDeclaredFields();

		//ff[0].setAccessible(true);
		//ff[0].set(p, 999);
		PersonDAO pd = new PersonDAO_Mock();

		ArrayList<Person> pp = pd.read();
		String str = "[";
		for (Person p : pp) 
		{
			Class cc = p.getClass();
			Field[] ff = cc.getDeclaredFields();

			str += "{";
			for (Field f : ff)
			{
				f.setAccessible(true);
				str += "\""+f.getName() + "\":\"" + f.get(p)+"\",";
			}
			str  = str.substring(0,str.length()-1);
			str += "},";
		}
		str  = str.substring(0,str.length()-1);
		str += "]";

		System.out.println( str );


		String rts = str.substring(1,str.length()-1);
		System.out.println(rts);
		String[] mar = rts.split("},");

		ArrayList<Person> dd = new ArrayList<Person>();

		for (String s : mar) 
		{
			//System.out.println( s );
			String ss = s.substring(1, s.length());
			if(ss.lastIndexOf('}') == ss.length()-1)
			{	
				ss = ss.substring(0,ss.length()-1);
			}
			System.out.println(ss);

			String[] sss = ss.split(","); 
			Person p = new Person();
			Class cc = p.getClass();
			Field[] ff = cc.getDeclaredFields();
			dd.add(p);

			for (String s1 : sss)
			{
				System.out.println( "\t" + s1);
				String[] ssss = s1.split(":");
				String key = ssss[0].substring(1, ssss[0].length()-1);
				String val = ssss[1].substring(1, ssss[1].length()-1);
				System.out.println( "\t\t" + key);
				System.out.println( "\t\t" + val);
				for (Field f: ff)
				{
					if( f.getName().equals(key))
					{
						f.setAccessible(true);
						if(f.getType().getName().equals("int"))
						{
							f.set(p, Integer.parseInt(val));
						}
						else
						{
							f.set(p, val);
						}
					}
				}
			}	
		}
		for (Person p: dd) 
		{
			System.out.println(p);
		}
	}
}

