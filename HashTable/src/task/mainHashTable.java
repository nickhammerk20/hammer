package task;
import blogic.HTableLine;
import blogic.Person;

public class mainHashTable
{
    public static void main(String[] args)
    {
    	HTableLine hashTable = new HTableLine();
//    	HTableChane hashTable = new HTableChane();
    	Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(11, "Sasia", 	"Pupkin", 		23),
				new Person(12, "Tasia", 	"Pupkin", 		23),
				new Person(13, "Uasia", 	"Pupkin", 		23),
				new Person(14, "Rasia", 	"Pupkin", 		23),
				new Person(15, "Kasia", 	"Lupkin", 		27),
				new Person(17, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(71, "Andrey",	"Petrishe",  	12),
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(34, "Sergey",	"Shevchenko", 	25),
				new Person(22, "Aleksey",	"Abrosimov", 	62),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17),
				};
    	
    	hashTable.init(ini);
    	System.out.println("********size*******");
    	System.out.println(hashTable.size());
    	System.out.println("********pow*******");
    	System.out.println(hashTable.pow());
    	System.out.println("********toArray*******");
    	Person[] print = hashTable.toArray();
    	
    	for ( int i = 0 ; i < print.length ; i++ )
    	{
    		System.out.println(print[i]);
    	}
    	System.out.println("********get*******");
    	Person getPerson = hashTable.get(69816);
    	System.out.println(getPerson);
    	
    	System.out.println("********del*******");
    	hashTable.del(69816);;
    	print = hashTable.toArray();
    	
    	for ( int i = 0 ; i < print.length ; i++ )
    	{
    		System.out.println(print[i]);
    	}
    	
    	System.out.println("********iterator*******");
    	for (Person p : hashTable) 
    	{
		System.out.println(p);	
		}
    }
}