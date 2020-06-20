package day16overloading;

public class Constructor03 {
	String isim = "Ali Can";
	int yaþ = 33;
	int kilo = 85;
	String meslek = "Automation Tester";
	boolean emekli = false;

	Constructor03() {
//		this.emekli = emekli;
//		this.isim = isim;
//		this.kilo = kilo;                // bunlarý yazmasakta olur.
//		this.meslek = meslek;
//		this.yaþ = yaþ;
	}

// ismi yeni oluþturabiliriz  , diðerleri ayný kalýr
	Constructor03(String isim) {

		this.isim = isim;

	}

// kilo ve yaþý deðiþtirebiliriz , diðerleri ayný kalýr
	Constructor03(int yaþ, int kilo) {
		this.kilo = kilo;
		this.yaþ = yaþ;

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
