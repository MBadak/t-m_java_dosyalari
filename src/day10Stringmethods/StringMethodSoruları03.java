package day10Stringmethods;

import java.util.Scanner;

public class StringMethodSoruları03 {

	public static void main(String[] args) {
		// Kullanýcýdan ilk ve soy ismini alýn 
		// ilk ve soy isminin ilk harflerini büyük harf olarak ekrana yazdýrýn.

		Scanner sc=new Scanner (System.in);
		System.out.println("Lütfen isminizi giriniz");
		String isim= sc.nextLine();
		System.out.println("Lütfen soyisminizi giriniz");
		String soy_isim=sc.nextLine();
		
		char iih=isim.toUpperCase().charAt(0);
		char siih=soy_isim.toUpperCase().charAt(0);
		
		System.out.println(iih);
		System.out.println(siih);
		
		sc.close();
		
	}

}
