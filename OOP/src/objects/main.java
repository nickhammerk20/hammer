package objects;

public class main 
{
	public static void main(String[] args) 
	{
		Phone phone = new Phone(1024, "gnusmus", "CDMA");
		phone.setName("jabloco");
		System.out.println("dfs  "+ phone.getType());
		System.out.println("dfs  "+ phone.getName());
	}
}
