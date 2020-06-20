package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperatorSoruları05 {

	public static void main(String[] args) {
		// Kullanýcýdan bir tamsayý girmesini isteyin,
		// o tamsayý 3 basamaklý ise ekrana “3 Basamaklý” yazdýrýn.
		// 3 basamaklý degilse çift olup olmadigini kontrol edin.
		// Çift ise “3 basamaklý olmayan çift sayý” yazdýrýn.
		// Çift sayý degilse “3 basamaklý olmayan tek sayý” yazdýrýn.
		Scanner scan = new Scanner(System.in);

		System.out.println("Bir tam sayi giriniz");
		int num = scan.nextInt();

		System.out.println("Girilen sayý :" + 
		(num > 99 && num < 1000 || num>-1000 && num<-99 ? " 3 basamaklýdýr."
				               : num % 2 == 0 ? "3 basamaklý olmayan çift sayýdýr." 
						       : "3 basamaklý olmayan tek sayýdýr."));
		scan.close();
	}

}
