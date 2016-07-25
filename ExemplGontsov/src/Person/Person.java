package Person;

public class Person 
{
	int id;
	String fname;
	String lname;
	int age;

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
	public String toString() 
	{
		return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}
}
