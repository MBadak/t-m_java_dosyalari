package day06ifstatement;

public class IfStatement04 {

	public static void main(String[] args) {
		// / Bir tane Strin variable olusturun ve bir gun ismini kucuk harflerle deger
		// olarak atayin
		// Eger atadiginiz deger hafta ici gunlerinden biri ise
		// ekrana “hafta ici” yazdirin.
		// Eger atadiginiz deger hafta sonu gunlerinden biri ise
		// ekrana “hafta sonu” yazdirin.

		String gün = "pazar";

		if (gün.equals("pazartesi")) {
			System.out.println("hafta içi");
		}

		if (gün.equals("salý")) {
			System.out.println("hafta içi");
		}
		if (gün == "çarþamba") {
			System.out.println("hafta içi");
		}
		if (gün == "perþembe") {
			System.out.println("hafta içi");
		}
		if (gün == "cuma") {
			System.out.println("hafta içi");
		}
		if (gün == "cumartesi") {
			System.out.println("hafta sonu");
		}
		if (gün == "pazar") {
			System.out.println("hafta sonu");
		}

		if (gün != "pazartesi" && gün != "salý" && gün != "çarþamba" && gün != "perþembe" && gün != "cuma"
				&& gün != "cumartesi" && gün != "pazar") {
			System.out.println("gün deðil");
		}

		// daha kýsa yol

		if (gün.equals("pazartesi") || gün.equals("salý") || gün.equals("çarþamba") || gün.equals("perþembe")
				|| gün.equals("cuma")) {
			System.out.println("hafta içi");
		}

		if (gün.equals("pazar") || gün.equals("cumartesi")) {
			System.out.println("hafta sonu");
		}
	}
}
