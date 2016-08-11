

public class Person implements Comparable<Person>
{
	private int id;
	private String fname;
	private String lname;
	private int age;

	public Person()
	{

	}
	public Person(int id, String fname, String lname, int age) 
	{
		init(id, fname, lname, age);
	}

	public void init(int id, String fname, String lname, int age) 
	{
		this.id    = id;
		this.fname = fname;
		this.lname = lname;
		this.age   = age;
	}
	
	@Override
	public int hashCode()
	{
		String str = fname + lname;
		int ret = 1;
		char simb = ' ';
		for(int i=0 ; i < str.length(); i++)
		{
			simb = str.charAt(i);
			ret = ret + ( simb * i );
		}
		return ret;
	}

	@Override
	public String toString() 
	{
		return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Person o) 
	{
		return (new Integer(id)).compareTo(o.id);
	}
}
