package blogic;

public class Person 
{
	public int id;
	public String fname;
	public String lname;
	public int age;
	public String telNumber;

	public Person()
	{

	}
	public Person(int id, String fname, String lname, int age, String telNumber) 
	{
		init(id, fname, lname, age, telNumber);
	}

	public void init(int id, String fname, String lname, int age, String telNumber) 
	{
		this.id    = id;
		this.fname = fname;
		this.lname = lname;
		this.age   = age;
		this.telNumber = telNumber;
	}

	@Override
	public String toString() 
	{
		return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + ", telNumber=" + telNumber + "]";
	}
}
