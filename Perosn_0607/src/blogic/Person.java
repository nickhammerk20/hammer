package blogic;

public class Person 
{
	private int id;
	private String fname;
	private String lname;
	private int age;
	private String telNumber;

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
