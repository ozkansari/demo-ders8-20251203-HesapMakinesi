package tr.edu.medipol.yova.util.calculator.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HesaplamaTest {

	@Test
	void testTopla() {
		// GIVEN - on kosullar
		int sayi1 = 999999;
		int sayi2 = 1;
		
		// WHEN - test edilecek metodun cagrilmasi
		int sonuc = Hesaplama.topla(sayi1, sayi2);
		
		// THEN - Kontroller
		assertEquals(1000000, sonuc);
	}

	@Test
	void testCikar() {
		// GIVEN - on kosullar
		int sayi1 = 999999;
		int sayi2 = 1;
		
		// WHEN - test edilecek metodun cagrilmasi
		int sonuc = Hesaplama.cikar(sayi1, sayi2);
		
		// THEN - Kontroller
		assertEquals(999998, sonuc);
	}

	@Test
	void testCarp() {
		// GIVEN - on kosullar
		int sayi1 = 999999;
		int sayi2 = 1;
		
		// WHEN - test edilecek metodun cagrilmasi
		int sonuc = Hesaplama.carp(sayi1, sayi2);
		
		// THEN - Kontroller
		assertEquals(999999, sonuc);
	}

	@Test
	void testBol() {
		// GIVEN - on kosullar
		int sayi1 = 999999;
		int sayi2 = 1;
		
		// WHEN - test edilecek metodun cagrilmasi
		int sonuc = Hesaplama.bol(sayi1, sayi2);
		
		// THEN - Kontroller
		assertEquals(999999, sonuc);
	}

	@Test
	void testBol_sifirin_bolunmesi() {
		// GIVEN - on kosullar
		int sayi1 = 0;
		int sayi2 = 1;
		
		// WHEN - test edilecek metodun cagrilmasi
		int sonuc = Hesaplama.bol(sayi1, sayi2);
		
		// THEN - Kontroller
		assertEquals(0, sonuc);
	}

	@Test
	void testBol_sifira_bolum() {
		// GIVEN - on kosullar
		int sayi1 = 999999;
		int sayi2 = 0;
		
		// WHEN & THEN
		assertThrows(ArithmeticException.class, () -> Hesaplama.bol(sayi1, sayi2));
		
	}

}
