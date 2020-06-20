package day09switchoperator;

import java.util.Scanner;

public class SwitchSoruları02 {

	public static void main(String[] args) {
//		Kullanýcýdan bir harf alýn eðer harf 
//		“a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdýrýn.
//		“b, c, d, f” den biri ise ekrana “Sessiz harf” yazdýrýn.
//		Bu harflerin dýþýnda bir character için “Geçersiz character” yazdýrýn.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen a,e,i,o,u ,b,c,d,f, harflerinden birini giriniz");

		char ch = scan.next().charAt(0);

		switch (ch) {

		case ('a'):
			System.out.println(ch +" :Sesli harf");
			break;
		case ('e'):
			System.out.println(ch +" :Sesli harf");
			break;
		case ('u'):
			System.out.println(ch +" :Sesli harf");
			break;
		case ('i'):
			System.out.println(ch +" :Sesli harf");
			break;
		case ('o'):
			System.out.println(ch +" :Sesli harf");
			break;
		case ('b'):
			System.out.println(ch +" :Sessiz harf");
			break;
		case ('c'):
			System.out.println(ch +" :Sessiz harf");
			break;
		case ('d'):
			System.out.println(ch +" :Sessiz harf");
			break;
		case ('f'):
			System.out.println(ch +" :Sessiz harf");
			break;
		default:
			System.out.println(ch +" :Geçersiz character");
		}
scan.close();
	}

}
