package HW1_Functions;
//Найти расстояние между двумя точками в двумерном декартовом пространстве.

public class HW_1_4_4{
	public static void main (String [] args){
		double x1=3, y1 = 4;
		double x2=0, y2 = 0;
		double res=fDlinaAB(x1, y1, x2, y2);
		System.out.println(res);
	}
	public static double fDlinaAB(double x1, double y1, double x2, double y2){
//		if (x1 == x2 || y1 == y2 ) {
//			throw new IllegalArgumentException( );
//		}
		double ret=0;
//		if (x1 < 0 ) { 
//			x1 = x1 * - 1 ; }
//		if (x2 < 0 ) { 
//			x2 = x2 * - 1 ; }
//		if (y1 < 0 ) { 
//			y2 = y2 * - 1 ; }
//		if (y1 < 0 ) { 
//			y2 = y2 * - 1 ; }
		double a = x1-x2;
		double b = y1-y2;
		
		ret = Math.sqrt(a * a + b * b);
		
		return ret;
	}
}