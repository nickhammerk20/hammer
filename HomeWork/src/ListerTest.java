import static org.junit.Assert.*;

import org.junit.Test;

public class ListerTest {
	   /**
	     * Тесты метода clear
	     */
	    @Test
	    public void testClear_1(){
	        int[] ini = new int[0];
	        Lister ls = new Lister();
	        ls.init(ini);
	        ls.clear();
	       assertEquals(0, ls.size());
	    }
	    @Test
	    public void testClear_2(){
	        int[] ini = {10};
	        Lister ls = new Lister();
	        ls.init(ini);
	        ls.clear();
	        assertEquals(0,ls.size());
	    }
	    @Test
	    public void testClear_3() {
	        int[] ini = {10,20};
	        Lister ls = new Lister();
	        ls.init(ini);
	        ls.clear();
	        assertEquals(0, ls.size());
	    }

	    @Test
	    public void testClear_4(){
	        int[] ini = {10, 20, 50, 77, 100, 150, 190, 255, 600};
	        Lister ls = new Lister();
	        ls.init(ini);
	        ls.clear();
	        assertEquals(0,ls.size());

	    }
	    /**
	     * Тесты метода print
	     */
	    @Test
	    public void testPrint_1(){
	        int[] ini = new int[0];
	        Lister ls = new Lister();
	        ls.init(ini);
	        ls.print();
	        assertEquals(0,ls.size());
	    }
	    @Test
	    public void testPrint_2(){
	        int[] ini = {0};
	        Lister ls = new Lister();
	        ls.init(ini);
	        ls.print();
	        assertEquals(1,ls.size());
	    }
	    @Test
	    public void testPrint_3(){
	        int[] ini = {};
	        Lister ls = new Lister();
	        ls.init(ini);
	        ls.print();
	        assertEquals(0,ls.size());
	    }
	    @Test
	    public void testPrint_4(){
	        int[] ini = {10, 20, 50, 77, 100, 150, 190, 255, 600};
	        Lister ls = new Lister();
	        ls.init(ini);
	        ls.print();
	        assertEquals(9,ls.size());
	    }

	}