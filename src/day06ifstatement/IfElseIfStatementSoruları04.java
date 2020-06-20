package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatementSoruları04 {

	public static void main(String[] args) {
//		Kullanýcýdan bir yýl alýn 
//		eðer yýl 1000’e bulunuyorsa ekrana “Milenyum” yazdýrýn.  
//		Eðer yýl 100’e bulunuyorsa ekrana “Yüzyýl” yazdýrýn. 
//		Eðer yýl 10’a bulunuyorsa ekrana “Onyýl” yazdýrýn

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir yýl giriniz");
		int yýl = scan.nextInt();
		// 0 yýlýný baþlangýç
		if (yýl < 0) {
			System.out.println("yýl 0 dan küçük olamaz");
		} else if (yýl == 0) {
			System.out.println("Baþlangýç");
		} else if (yýl % 1000 == 0) {
			System.out.println("Milenyum");
		} else if (yýl % 100 == 0) {
			System.out.println("Yüzyýl");
		} else if (yýl % 10 == 0) {
			System.out.println("Onyýl");
		} else {
			System.out.println("Milenyum yada Yüzyýl yada Onyýl deðil");
		}
		scan.close();
	}

}
