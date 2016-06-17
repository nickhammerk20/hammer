
public class aList0 {

	int [] ar = new int [0]; 
	
	
	public int min() /* ок */{
		if (ar==null || ar.length==0) {
			throw new IllegalArgumentException("краш метода min");
		}
		int ret = ar[0];
		for(int i=1; i<ar.length; i++){
			if( ret > ar[i] ){
				ret = ar[i];
			}
		}
		return ret;
	}
	public int max() /* ок */{
		if (ar==null || ar.length==0) {
			throw new IllegalArgumentException("краш метода max");
		}
		int ret = ar[0];
		for(int i=1; i<ar.length; i++){
			if( ret < ar[i] ){
				ret = ar[i];
			}
		}
		return ret;		
	}
	public int minPos() /* ок */{
		if (ar==null || ar.length==0) {
			throw new IllegalArgumentException("краш метода minPos");
		}
		int ret = 0;
		int min = ar[0];
		for(int i=1; i<ar.length; i++){
			if( min > ar[i] ){
				min = ar[i];
				ret = i;
			}
		}
		return ret;
	}
	public int maxPos() /* ок */{
		if (ar==null || ar.length==0) {
			throw new IllegalArgumentException("краш метода maxPos");
		}
		int ret = 0;
		int max = ar[0];
		for(int i=1; i<ar.length; i++){
			if( max < ar[i] ){
				max = ar[i];
				ret = i;
				
			}
		}
		return ret;	
	}
	public void sort() 
		{
		if (ar.length==0) {
			return;
		}	
		
			for (int i = 0; i < ar.length-1; i++) 
			{
				for (int j = 0; j < ar.length-1; j++) 
				{
					if(ar[j] > ar[j+1])
					{
						int tmp = ar[j];
						ar[j]   = ar[j+1];
						ar[j+1] = tmp;
					}
				}
			}
		}
	public void revers() /* ок */{
		if (ar==null || ar.length==0) {
			throw new IllegalArgumentException("краш метода revers");
		}	
		for (int i=0; ar.length/2>i ; i++){
			int temp = ar[i];
			ar[i] = ar[ar.length - i - 1];
			ar[ar.length - i - 1] = temp;
		}
		
	}
	public void halfRevers() /* ок */{
		if (ar==null || ar.length==0) {
			throw new IllegalArgumentException("краш метода halfRevers");
		}
		int arrlength = ar.length/2;
		int arrhalf = ar.length - arrlength;
		for (int i=0; arrlength>i ; i++){
			int temp = ar[i];
			ar[i] = ar[arrhalf + i];
			ar[arrhalf + i] = temp;
		}
		
		
	}
	public int get(int pos) /* ok */{
		if(ar == null || ar.length == 0 || pos>ar.length){
			throw new IllegalArgumentException("краш метода get");
		}
		int ret = ar[pos];
		return ret;		
	}
	public void set(int pos, int val) /* ok */ {
		if(ar == null || ar.length == 0 || pos>ar.length){
			throw new IllegalArgumentException("краш метода set");
		}
		ar[pos] = val;		
	}
	public void clear() /* нужно тестировать */
	{
		ar = new int [0];
	}
	public void init(int [] rr) /* ok */{
			// инициировать необходимый массив в наш массив "ar[]"
		if(rr == null ){
			throw new IllegalArgumentException("краш метода init");
		}
		ar = rr;		
		
	}
	public int [] toArray() /* ок */{
		if(ar == null || ar.length == 0){
			throw new IllegalArgumentException("краш метода toArray");
		}
		int [] ret = ar;
		return ret;		
	}
	public String print() /* ok */{
		if(ar == null || ar.length == 0){
			throw new IllegalArgumentException("краш метода print");
		}
		String ret = "";
		for(int i = 0; i<ar.length; i++){
			ret+=ar[i]+",";
			System.out.println(ar[i]+", ");
		}
		return ret;
	}
	public int size() /* ok */{
		if(ar == null || ar.length == 0){
			throw new IllegalArgumentException("краш метода size");
		}
		int ret = ar.length;
		return ret;		
	}
	public void addStart(int val)/* нужно тестировать */ {
		if(ar == null){
			throw new IllegalArgumentException("краш метода addStart");
		}
		int [] tmp = new int [ar.length+1];
		for (int i=0; i<ar.length; i++){ //смещаем исходный массив на 1 элемент вправо
			tmp[i+1] = ar[i];
			}
		tmp[0]=val;
		ar=tmp;		
	}
	public void addEnd(int val)/* нужно тестировать */ {
		if(ar == null ){
			throw new IllegalArgumentException("краш метода addEnd");
		}
		/*пример Вадима от 11.05.16*/
		int [] tmp = new int [ar.length+1];
		for (int i=0; i<ar.length; i++){
			tmp[i] = ar[i];
			}
		tmp[ar.length]=val;
		ar=tmp;					
	}
	public void addPos(int pos, int val) /* нужно тестировать */ {
		if(ar == null ){
			throw new IllegalArgumentException("краш метода addPos");
		}
				int [] tmp = new int [ar.length+1];
		for (int i = 0; i<pos; i++){
			tmp[i] = ar[i];
			}
		for (int i = pos+1; i<ar.length; i++){
			tmp[i] = ar[i-1];
			}
		tmp[pos]=val;
		ar=tmp;
	}
	public int delStart() /* нужно тестировать */ {
		if(ar == null || ar.length == 0){
			throw new IllegalArgumentException("краш метода delStart");
		}
		int ret = ar[0];
		int [] tmp = new int [ar.length-1];
		for (int i = 1; i<ar.length; i++){
			tmp[i-1] = ar[i];
			}
		ar=tmp;
		return ret;		
	}
	public int delEnd() /* нужно тестировать */ {
		if(ar == null || ar.length == 0){
			throw new IllegalArgumentException("краш метода delEnd");
		}
		int ret = ar[ar.length-1];
		int [] tmp = new int [ar.length-1];
		for (int i = 0; i<ar.length-1; i++){
			tmp[i] = ar[i];
			}
		ar=tmp;
		return ret;		
	}
	public int delPos(int pos) /* нужно тестировать */ {
		if(ar == null || ar.length == 0 || pos < 0|| pos > ar.length){
			throw new IllegalArgumentException("краш метода delPos");
		}
		int ret = ar[pos];
		int [] tmp = new int [ar.length-1];
		for (int i = 0; i<pos; i++){
			tmp[i] = ar[i];
			}
		for (int i = pos+1; i<ar.length-1; i++){
			tmp[i-1] = ar[i];
			}
		ar=tmp;
		return ret;			
	}
	
}
