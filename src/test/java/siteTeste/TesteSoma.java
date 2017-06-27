package siteTeste;



import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import site.Somar;

public class TesteSoma{

	private static Somar soma;

	@BeforeClass
	public static void initSoma() {

		soma = new Somar();
	}
	@Test
	    public void testSoma() {
	        double result = soma.somar(3, 4);
	        assertEquals(7, result,0);
	    }

	

}
