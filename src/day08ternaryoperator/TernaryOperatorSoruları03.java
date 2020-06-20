package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperatorSoruları03 {

	public static void main(String[] args) {
		// Kullanýcýdan bir tamsayý girmesini isteyin,
		// ekrana o tamsayýnýn mutlak degerini yazdýrýn.
		Scanner scan = new Scanner(System.in);

		System.out.println("Bir tam sayi giriniz");
		int num = scan.nextInt();

		System.out.println(num + " :sayýsýnýn mutlak deðeri =" + (num < 0 ? num * (-1) : num));

		scan.close();
	}

}
