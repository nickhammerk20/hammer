public class mainHashTable
{
    public static void main(String[] args)
    {
    	HTableLine hashTable = new HTableLine();
//    	HTableChane hashTable = new HTableChane();
    	Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(17, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(71, "Andrey",	"Petrishe",  	12),
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(34, "Sergey",	"Shevchenko", 	25),
				new Person(22, "Aleksey",	"Abrosimov", 	62),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17),};
    	
    	hashTable.init(ini);
    	
//    	hashTable.add( new Person(10, "Vasia", 		"Pupkin", 		23) );
//    	hashTable.add( new Person(14, "Kasia", 		"Lupkin", 		27) );
//    	hashTable.add( new Person(17, "Masia",		"Gupkin",		19) );
//    	hashTable.add( new Person(33, "Gasia", 		"Hupkin", 		56) );
//    	hashTable.add( new Person(60, "Lasia", 		"Jupkin", 		99) );
//    	hashTable.add( new Person(71, "Andrey",		"Petrishe",  	12) );
//    	hashTable.add( new Person(12, "Volodya",	"Kovalevskij", 	23) );
//    	hashTable.add( new Person(34, "Sergey",		"Shevchenko", 	25) );

        for (Integer p : hashTable)
        {        	
			System.out.println(p.toString());
		}
    }
}