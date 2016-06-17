import static org.junit.Assert.*;

import org.junit.Test;

public class dlinatest {

	@Test
	public void testdlinamile() {
		double res=dlina.mile(100);
		assertEquals(62.137, res, 0.001);
		
	}
	@Test
	public void testdlinajard() {
		double res=dlina.jard(100);
		assertEquals(1093.613, res, 0.001);
	}
	@Test
	public void testdlinafut() {
		double res=dlina.fut(100);
		assertEquals(3280.839895013123, res, 0.001);
	}
	@Test
	public void testdlinaduim() {
		double res=dlina.duim(100);
		assertEquals(39370.07874015748, res, 0.001);
	}
	
	@Test
	public void massfunt() {
		double res=mass.funt(100);
		assertEquals(220.462, res, 0.001);
	}
	@Test
	public void masspud() {
		double res=mass.pud(100);
		assertEquals(6.10482, res, 0.0001);
	}
	@Test
	public void massuncia() {
		double res=mass.uncia(100);
		assertEquals(3527.396194, res, 0.00001);
	}
	@Test
	public void massmane() {
		double res=mass.mane(100);
		assertEquals(43.8596, res, 0.0001);
	}
	@Test
	public void massshekel() {
		double res=mass.shekel(100);
		assertEquals(7142.85714, res, 0.0001);
	}
	
	@Test
	public void tempfaring() {
		double res=temp.faring(100);
		assertEquals(212, res, 0.1);
	}
	@Test
	public void tempkelvin() {
		double res=temp.kelvin(100);
		assertEquals(373.15, res, 0.01);
	}
	@Test
	public void tempnjuton() {
		double res=temp.njuton(100);
		assertEquals(33.0, res, 0.1);
	}
	@Test
	public void temprankin() {
		double res=temp.rankin(100);
		assertEquals(671.67, res, 0.01);
	}
	@Test
	public void tempguk() {
		double res=temp.guk(100);
		assertEquals(41.6, res, 0.1);
	}
	
	@Test
	public void volumebarell() {
		double res=volume.barell(100);
		assertEquals(0.628998, res, 0.000001);
	}
	@Test
	public void volumegalon() {
		double res=volume.galon(100);
		assertEquals(26.4176, res, 0.001);
	}
	@Test
	public void volumepinta() {
		double res=volume.pinta(100);
		assertEquals(211.337, res, 0.001);
	}
	@Test
	public void volumekvarta() {
		double res=volume.kvarta(100);
		assertEquals(105.674, res, 0.001);
	}
	@Test
	public void volumekubduim() {
		double res=volume.kubduim(100);
		assertEquals(3937.007, res, 0.001);
	}
}
