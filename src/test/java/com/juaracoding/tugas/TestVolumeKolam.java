package com.juaracoding.tugas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.juaracoding.tugas1.KelilingKolam;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestVolumeKolam {
	
	KelilingKolam volumeKolam;

	@Before
	public void setUp() throws Exception {
		
		volumeKolam = new KelilingKolam();
	}

	@Test
	@FileParameters("src/test/resources/volumekolam.csv")
public void testVolumeKolam(double p, double l, double t, double expect) {
		
		double actual = volumeKolam.KelilingKolam(p, l, t);
		assertEquals(expect, actual, 0.0);
	}

	
	@Test
	public void testVolumeKolamAngkaNegatif() {
		double p = -5;
		double l = -1;
		double t = -4;
		double actual = volumeKolam.KelilingKolam(p, l, t);
		
		assertEquals(-20, actual, 0.0);
	}
	
	@Test
	public void testVolumeKolamAngkaNull() {
		
		double p = 0;
		double l = 0;
		double t = 0;
		Double sisiNull = null;
		double actual = volumeKolam.KelilingKolam(p, l, t);
		
		assertNull(sisiNull);
		assertEquals(0, actual, 0.0);
	}

}
