package blogic;

import java.util.Comparator;

public class PersonLnameComp implements Comparator<Person>
{
	@Override
	public int compare(Person o1, Person o2) 
	{
		return o1.lname.compareToIgnoreCase(o2.lname);
	}
}
