/**
 *  пример от Ћещенко ёры))))
 */


public class Lister {

     int[] arr = new int[0];
    private int index = 0;
//    private boolean zero = true;


    /**
     * ---------------------------------Metod clear
     *
     */
        public void clear(){
            index = 0;
        }
    /**
     * ---------------------------------Metod init
     *
     */
    public void init (int[]ini) {
        int[] arr = new int [ini.length];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = ini[i];

            for (int j = 0; j < ini.length; j++) {
                index++;
            }
        }
        index = ini.length;
        }
    /**
     * ---------------------------------Metod toArrya
     *
     */
    public int[] toArray(){
            int[] ret = new int[index];
            for (int i = 0; i < index + 1; i++)
            {
                ret[i] = arr[i];
            }
            return ret;
        }
    /**
     * ---------------------------------Metod Print
     *
     */
    public void print() {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    /**
     * ---------------------------------Metod Size
     *
     */
        public int size(){
            return index;
        }
        public void addStart(){

        }
        public void addEnd(){

        }
        public void addPos(){

        }
        public void delStart(){

        }
        public void delEnd(){

        }
        public void delPos(){

        }
    /**
     *-------------------------------------------Metod Min
     *
     */
        public int min(){
            if(index == 0){
                throw new IllegalArgumentException("в методе min index == 0");
            }
            int min = 0;
            for (int i = 1; i < arr.length; i++) {
                    if(arr[i] < min){
                        min = arr[i];
                    }
            }
            return min;
        }

    /**
     * ------------------------------------------Metod Max
     *
     */
    public int max(){
            if(index == 0){
                throw new IllegalArgumentException("в методе max index == 0");
            }
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > max()){
                    max = arr[i];
                }
            }
            return max;
        }
        public void minPos(){

        }
        public void maxPos(){

        }
        public void sort() {

        }
        public void reverse(){

        }
        public void halfReverse(){

        }
        public void get(){

        }
        public void set(){

        }
    }