package day16overloading;

public class Constructor03 {
	String isim = "Ali Can";
	int ya� = 33;
	int kilo = 85;
	String meslek = "Automation Tester";
	boolean emekli = false;

	Constructor03() {
//		this.emekli = emekli;
//		this.isim = isim;
//		this.kilo = kilo;                // bunlar� yazmasakta olur.
//		this.meslek = meslek;
//		this.ya� = ya�;
	}

// ismi yeni olu�turabiliriz  , di�erleri ayn� kal�r
	Constructor03(String isim) {

		this.isim = isim;

	}

// kilo ve ya�� de�i�tirebiliriz , di�erleri ayn� kal�r
	Constructor03(int ya�, int kilo) {
		this.kilo = kilo;
		this.ya� = ya�;

	}

	public static void main(String[] args) {

		Constructor03 insan1 = new Constructor03();
		System.out.println(insan1.isim);
		System.out.println(insan1.kilo);

		Constructor03 insan2 = new Constructor03("mustafa badak");
		System.out.println(insan2.isim);
		System.out.println(insan2.kilo);

	}

}
