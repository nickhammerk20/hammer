
public class main {

	public static void main(String[] args) 
	{
		String fname = "Vasia";
		String lname = "Pupkin";
		String str = fname + lname;
		int ret = 1;
		char simb = ' ';
		for(int i=0 ; i < str.length(); i++)
		{
			simb = str.charAt(i);
			System.out.print(simb + ", " + (int) simb +", ");
			ret = ret + ( simb * i );
			System.out.println(ret);
		}
		System.out.println("fname = "+fname+ ", lname = " + lname + ", ret = " + ret );

	}

}
