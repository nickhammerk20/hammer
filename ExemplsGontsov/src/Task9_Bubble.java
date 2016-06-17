public class Task9_Bubble 
{
	public static void Bubble(int Mas[])
	{
		if(Mas == null || Mas.length == 0)
			return;
		
		for(int i=0;i<Mas.length;i++)
		{
			for(int j=0;j<Mas.length-i-1;j++)
			{
				if(Mas[j]>Mas[j+1])
				{
					Mas[j]+=Mas[j+1];
					Mas[j+1]=Mas[j]-Mas[j+1];
					Mas[j]=Mas[j]-Mas[j+1];
				}
			}
		}
	}
}
