package day06ifstatement;

public class IfStatement02 {

	public static void main(String[] args) {
		// Bir integer variable olusturun deger atayin
		// Deger cift sayi ise ekrana “cift” yazdirin
		// Deger tek sayi ise ekrana “tek” yazdirin

		int num = 12;

		if (num % 2 == 0) // sayının 2 ye bölümünden kalan o ise çift
		{
			System.out.println("çift");
		}

		if (num % 2 != 0) {
			System.out.println("tek");
		}

	}

}
