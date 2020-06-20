package day18statickeyword;

public class Static01 {

	static int en = 12;
	static int boy = 10;
	static int alan; // e�er bir varible de�erini olu�turuken hesapyapmak gerekirse.
	static double pi; // "static block " olu�turmak ve i�ersine yazmak daha iyidir
						// static { } bu �ekilde a��l�r.
						// static block veriallere de�er atamak i�inde kullan�l�r
						// static block class �n i�ersinde di�erlerinin d���nda olu�turulur.
						// en ba�ta static block �al���r. birden fazla ise �sten ba�lar
	static {

		pi = 3.14;
	}
	static {
		alan = en * boy; // hata almamak i�in stattik varible kullan
	}

	public static void main(String[] args) {
		System.out.println(pi);
	}
	
	// static class da olu�turulabilir . fakat ancak alt class larda olu�turulabilir
	// alt (inner)  class ,�st (outer) class �n body si i�ersinde olu�ur
	
	static class AltClass {
		// bu bir alt classt�r.
	}
	
}
