package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {
		// kullan�c�da say� al
		// pozitif veya 0  ise pozitif veya 0
		// negatifse negatif yazd�r�n�z

		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen bir say� giriniz");
		int num = scan.nextInt();

		if (num >= 0) {
			System.out.println("pozitif veya 0");
		} else {
			System.out.println("Negatif");
		}
		
		// Tternary OPerator   daha k�sa yazmak i�in
		String sonuc= (num>= 0)         ?          "pozitif veya 0"   :    "Negatif"  ;  
		            // �nce denklem  // ? yaz      // do�ru ise     //:   // yanl��sa       //;
		System.out.println(sonuc);
		
		
		scan.close();
		
	}

}
