package day06ifstatement;

public class IfStatement04 {

	public static void main(String[] args) {
		// / Bir tane Strin variable olusturun ve bir gun ismini kucuk harflerle deger
		// olarak atayin
		// Eger atadiginiz deger hafta ici gunlerinden biri ise
		// ekrana �hafta ici� yazdirin.
		// Eger atadiginiz deger hafta sonu gunlerinden biri ise
		// ekrana �hafta sonu� yazdirin.

		String g�n = "pazar";

		if (g�n.equals("pazartesi")) {
			System.out.println("hafta i�i");
		}

		if (g�n.equals("sal�")) {
			System.out.println("hafta i�i");
		}
		if (g�n == "�ar�amba") {
			System.out.println("hafta i�i");
		}
		if (g�n == "per�embe") {
			System.out.println("hafta i�i");
		}
		if (g�n == "cuma") {
			System.out.println("hafta i�i");
		}
		if (g�n == "cumartesi") {
			System.out.println("hafta sonu");
		}
		if (g�n == "pazar") {
			System.out.println("hafta sonu");
		}

		if (g�n != "pazartesi" && g�n != "sal�" && g�n != "�ar�amba" && g�n != "per�embe" && g�n != "cuma"
				&& g�n != "cumartesi" && g�n != "pazar") {
			System.out.println("g�n de�il");
		}

		// daha k�sa yol

		if (g�n.equals("pazartesi") || g�n.equals("sal�") || g�n.equals("�ar�amba") || g�n.equals("per�embe")
				|| g�n.equals("cuma")) {
			System.out.println("hafta i�i");
		}

		if (g�n.equals("pazar") || g�n.equals("cumartesi")) {
			System.out.println("hafta sonu");
		}
	}
}
