package day07nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin
		// Bu sayi pozitif veya 0 ise 9 dan buyuk mu diye kontrol edin,
		// 9 dan buyuk ise ekrana “Sayi” yazdirin
		// 9 dan kucuk esit ve 0'dan buyuk esit ise ekrana “Rakam” yazdirin
		// Bu sayi negatif ise ekrana “Sayi” yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir tam sayı giriniz");
		int num = scan.nextInt();

		// if için if koymaya nested denir zigon sehpa gibi içiçe

		if (num >= 0) {
			if (num > 9) {
				System.out.println("sayı");
			} else if (num <= 9 && num >= 0) {
				System.out.println("rakam");
			}else if(num<0) {System.out.println("sayı");}
			
			scan.close(); // yukarıdaki scan yazısının altında sarı işaret vardı 
			              // açtınız kapatınız diyor bunun için scan.close(); yaptık
			
		}

	}

}
