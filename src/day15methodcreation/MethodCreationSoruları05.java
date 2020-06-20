package day15methodcreation;

import java.util.Scanner;

public class MethodCreationSoruları05 {

	public static void main(String[] args) {
		// SORU 5:Kullanýcýya bir String girmesini söyleyin ve bu String’i yukarýdan
		// aþaðýya doðru yazdýran
		// Program yazýnýz. Ornegin; CAN ==>
//		      C
//				A
//				N

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime veya cumle giriniz ");
		String str = scan.nextLine();

		int i = 0;

		duseyYaz(str, i);

		scan.close();
	}

	public static void duseyYaz(String str, int i) {

		for (i = 0; i <= str.length() - 1; i++) {

			System.out.println(str.charAt(i));
		}

	}

}
