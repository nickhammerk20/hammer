
public class abubariba {

	public static void main (String [] args){
		
		int [] ar = {1,2,3};
		int val = 9;
			for(int i = 0; i<ar.length; i++){
				System.out.print(ar[i]+" ");
			}
			System.out.println();
		int [] tmp = new int [ar.length+1];
		for (int i=0; i<ar.length; i++){ 
			tmp[i+1] = ar[i];
			}
		for(int i = 0; i<tmp.length; i++){
			System.out.print(tmp[i]+" ");
		}
		System.out.println();
		tmp[0]=val;
		ar=tmp;	
		for(int i = 0; i<ar.length; i++){
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		for(int i = 0; i<tmp.length; i++){
			System.out.print(tmp[i]+" ");
		}
	}
}
