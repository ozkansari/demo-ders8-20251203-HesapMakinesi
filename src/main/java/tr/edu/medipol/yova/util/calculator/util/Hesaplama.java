package tr.edu.medipol.yova.util.calculator.util;

public class Hesaplama {

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public static int cikar(int sayi1, int sayi2) {
		return sayi1 - sayi2;
	}
	
	public static int carp(int sayi1, int sayi2) {
		return sayi1 * sayi2;
	}
	
	public static int bol(int sayi1, int sayi2) {
		return sayi1 / sayi2;
	}
	
	public static int fark(int sayi1, int sayi2) {
		if(sayi1 == sayi2) {
			return 0
		} else if(sayi1 > sayi2) {
			return Hesaplama.cikar(sayi1, sayi2);
		} else {
			return Hesaplama.cikar(sayi2, sayi1);
		}
	}
}
