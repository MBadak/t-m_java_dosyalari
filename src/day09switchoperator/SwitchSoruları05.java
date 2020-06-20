package day09switchoperator;

import java.util.Scanner;

public class SwitchSoruları05 {

	public static void main(String[] args) {

//		Kullanýcýdan A, B, C, D harflerinden birini alýn 
//		eðer harf C ise ekrana “Doðru cevap” yazdýrýn. 
//		A, B, D den biri ise ekrana “Yanlýþ cevap” yazdýrýn. 
//		Bu harflerin dýþýndaki harfler için “Geçersiz cevap þýkký” yazdýrýn

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen A,B,C,D harflerinden birini girniz");

		char ch = scan.next().charAt(0);

		switch (ch) {
		case ('C'):
			System.out.println(ch + " :Doðru cevap");
			break;
		case ('A'):
			System.out.println(ch + " :Yanlýþ cevap");
			break;
		case ('B'):
			System.out.println(ch + " :Yanlýþ cevap");
			break;
		case ('D'):
			System.out.println(ch + " :Yanlýþ cevap");
			break;
		case ('c'):
			System.out.println(ch + " :Doðru cevap");
			break;
		case ('a'):
			System.out.println(ch + " :Yanlýþ cevap");
			break;
		case ('b'):
			System.out.println(ch + " :Yanlýþ cevap");
			break;
		case ('d'):
			System.out.println(ch + " :Yanlýþ cevap");
			break;
		default:
			System.out.println(ch + " :Geçersiz cevap þýkk");

		}

		scan.close();
	}

}
