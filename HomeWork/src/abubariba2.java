
public class abubariba2 {

	public static void main (String [] args){
		
		int [] ar = {1,2,3};
		int val = 9;
		aList0 list = new aList0();
		for(int i = 0; i<ar.length; i++){
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		list.init(ar);
		list.addStart(val);
		for(int i = 0; i<ar.length; i++){
			System.out.print(ar[i]+" ");
		}
	}
}
