package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {
		// kullanýcýda sayý al
		// pozitif veya 0  ise pozitif veya 0
		// negatifse negatif yazdýrýnýz

		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen bir sayý giriniz");
		int num = scan.nextInt();

		if (num >= 0) {
			System.out.println("pozitif veya 0");
		} else {
			System.out.println("Negatif");
		}
		
		// Tternary OPerator   daha kýsa yazmak için
		String sonuc= (num>= 0)         ?          "pozitif veya 0"   :    "Negatif"  ;  
		            // önce denklem  // ? yaz      // doðru ise     //:   // yanlýþsa       //;
		System.out.println(sonuc);
		
		
		scan.close();
		
	}

}
