package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperatorSoruları06 {

	public static void main(String[] args) {
		// Kullanýcýdan bir yýl girmesini isteyin,
		// yýl artýk yýl ise ekrana “Artýk yýl”
		// degilse ekrana “Artýk yýl degil” yazdýrýn.

		Scanner scan = new Scanner(System.in);

		System.out.println("Yýl giriniz");
		int yýl = scan.nextInt();

		String sonuç = yýl % 100 == 0 ? yýl % 400 == 0 ? "artýk yýl" : "artýk yýl deðil"
				: yýl % 4 == 0 ? "artýk yýl" : "artýk yýl deðil";

		System.out.println(sonuç);

		scan.close();

	}

}
