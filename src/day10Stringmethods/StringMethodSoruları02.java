package day10Stringmethods;

import java.util.Scanner;

public class StringMethodSoruları02 {

	public static void main(String[] args) {
		// Kullanýcýdan ilk ve soy ismini alýn 
		// ilk ve soy isminin kaç harften oluþtuðunu ekrana yazdýrýn.
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Lütfen isminizi giriniz");
		String isim= sc.nextLine();
		System.out.println("Lütfen soyisminizi giriniz");
		String soy_isim=sc.nextLine();
		
		int isimindex=isim.length();
		int soyisimindex= soy_isim.length();
		System.out.println(isimindex);
		System.out.println(soyisimindex);
		sc.close();
	}

}
