package HW1_Functions;
// Вводим число (0­999), получаем строку с прописью числа.

public class HW_1_4_2{
	public static void main (String [] args){
		int r=998;
		String res=fChisloToPropis(r);
		System.out.println(res);
	}
	public static String fChisloToPropis(int r){
		if (r<0) {
			throw new IllegalArgumentException();
		}
		String [] one = {"ноль","один","два","три","четыре","пять","шесть","семь","восемь","девять"};
		String [] eleven = {"десять","одиннадцать","двенадцать","тринадцать","четырнадцать","пятьнадцать","шестьнадцать", "семьнадцать", "восемьнадцать", "девятьнадцать"};
		String [] ten = {"","десять","двадцать","тридцать","сорок","пятьдесят","шестьдесят","семьдесят","восемьдесят","девяносто"};
		String [] hundred = {"","сто","двести","триста","четыреста","пятьсот","шестьсот","семьсот","восемьсот","девятьсот"};
		String ret = "";
		int a = r/100;
		int b = (r%100)/10;
		int c = r%10;
		
//		System.out.println("a = "+a+" b = "+b+" c = "+c+" ret = "+ret);
		if( (a + b + c) == 0 ){ // "нулевое значение "
			ret = one[c];
//			System.out.println("нулевое значение "+"a = "+a+" b = "+b+" c = "+c+" ret = "+ret);
			}
		else if (r<10){ //  "значение от 0 до 9 "
			ret = one[c];
//			System.out.println("значение от 0 до 9 "+"a = "+a+" b = "+b+" c = "+c+" ret = "+ret);
		}
		else if (r >= 10 && r <= 19){ //  "значение от 10 до 19 "
			ret = eleven[c];
//			System.out.println("значение от 10 до 19 "+"a = "+a+" b = "+b+" c = "+c+" ret = "+ret);
			}
		else if ( a==0 && b!= 0 & c == 0 ){// "круглые десятки "
			ret = ten[b];
//			System.out.println("круглые десятки "+"a = "+a+" b = "+b+" c = "+c+" ret = "+ret);
			}
		else if ( a== 0 && b!= 0 && c != 0 ){// "НЕкруглые десятки "
			ret = ten[b];
			ret+= " "+one[c];
//			System.out.println("НЕкруглые десятки "+"a = "+a+" b = "+b+" c = "+c+" ret = "+ret);
			}
		else if (r >= 100 && ( b + c ) == 0){ // "круглые сотки "
			ret = hundred[a];
//			System.out.println("круглые сотки "+"a = "+a+" b = "+b+" c = "+c+" ret = "+ret);
		}
		else if (r >= 100 && b == 0 && c >= 1 && c <= 9 ){ //"сотка и от 1 до 9 "
			ret = hundred[a];
			ret+= " "+one[c];
//			System.out.println("сотка и от 1 до 9 "+"a = "+a+" b = "+b+" c = "+c+" ret = "+ret);
		}
		else if (r >= 100 && b == 1 && c !=0 ){  // "стока и одиннадцать "
			ret = hundred[a];
			ret+= " "+eleven[c];
//			System.out.println("сотка и одиннадцать "+"a = "+a+" b = "+b+" c = "+c+" ret = "+ret);
		}
		else if (r >= 100 && b > 0 && c ==0 ){  // "стока и круглая десятка "
			ret = hundred[a];
			ret+= " "+ten[b];
//			System.out.println("сотка и круглая десятка "+"a = "+a+" b = "+b+" c = "+c+" ret = "+ret);
		}
		else if (r >= 100 && b > 1 && c !=0 ){  // "стока и НЕдесятка "
			ret = hundred[a];
			ret+= " "+ten[b];
			ret+= " "+one[c];
//			System.out.println("сотка и НЕдесятка "+"a = "+a+" b = "+b+" c = "+c+" ret = "+ret);
		}

		else if (a == 0 ){
			ret = hundred[a] + " " + ret; 
		}
		
		return ret;
	}
}