package task;

public class mainHashCode {

	public static void main(String[] args) 
	{
		String[] str = {"Vasia","Visaa","Vbsia","Pupkin", "Zubkin", "dubkin", "Lupkin","lupkin"};
		int ret = 1;
		char simb = ' ';
		for(int j = 0 ; j< str.length; j++)
		{
			String strX = str[j];
			for(int i=0 ; i < strX.length(); i++)
			{
				simb = strX.charAt(i);
				//System.out.print(simb + ", " + (int) simb +", ");
				ret = ret + ( simb * i );
				//System.out.println(ret);
			}
			int ht = ret % 97;
			System.out.println("str = "+str[j]+ ", ret = " + ret + ", ht% = "+ ht);
		}

	}

}
