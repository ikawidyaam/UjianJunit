package com.juaracoding.tugas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.juaracoding.tugas1.KelilingKolam;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;



@RunWith(JUnitParamsRunner.class)
 public class TestKelilingKolam {
	
	KelilingKolam kelilingKolam;

	@Before
	public void setUp() throws Exception {
		
		kelilingKolam = new KelilingKolam();
	}
	
	
	@Test
	@FileParameters("src/test/resources/kelilingkolam.csv")
	public void testKelilingKolam(double p, double l, double t, double expect) {
		
		double actual = kelilingKolam.KelilingKolam(p, l, t);
		assertEquals(expect, actual, 0.0);
	}
	

//	@Test
//	public void testKelilingKolamBukanAngka() {
//		
//		String p = "A";
//		String l = "B";
//		String t = "C";
//		double a = Double.parseDouble(p);
//		double b = Double.parseDouble(l);
//		double c = Double.parseDouble(t);
//		double actual = kelilingKolam.KelilingKolam(a,b,c);
//		String expect = "A";
//		
//		assertEquals(Double.parseDouble(expect), actual, 0.0);
//	}
	
	@Test
	public void testKelilingKolamAngkaNegatif() {
		double p = -5;
		double l = -2;
		double t = -4;
		double actual = kelilingKolam.KelilingKolam(p, l, t);
		
		assertEquals(-44, actual, 0.0);
	}
	
	@Test
	public void testKelilingKolamAngkaNull() {
		
		double p = 0;
		double l = 0;
		double t = 0;
		Double sisiNull = null;
		double actual = kelilingKolam.KelilingKolam(p, l, t);
		
		assertNull(sisiNull);
		assertEquals(0, actual, 0.0);
	}

}
