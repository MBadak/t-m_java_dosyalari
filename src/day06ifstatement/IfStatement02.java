package day06ifstatement;

public class IfStatement02 {

	public static void main(String[] args) {
		// Bir integer variable olusturun deger atayin
		// Deger cift sayi ise ekrana �cift� yazdirin
		// Deger tek sayi ise ekrana �tek� yazdirin

		int num = 12;

		if (num % 2 == 0) // say�n�n 2 ye b�l�m�nden kalan o ise �ift
		{
			System.out.println("�ift");
		}

		if (num % 2 != 0) {
			System.out.println("tek");
		}

	}

}
