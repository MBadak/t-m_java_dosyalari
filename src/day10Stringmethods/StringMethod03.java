package day10Stringmethods;

import java.util.Scanner;

public class StringMethod03 {

	public static void main(String[] args) {
		
		// charAt() metodu
		
		// belli indeksteki karaeketri gösterir.
		
		String str1="cimbombom";
		
		// str1 in 4. indexteki karekteri yazan proðram yazýnýz
		
		System.out.println(str1.charAt(4));  //  index i 4 olan 'o' harfidir
		System.out.println(str1.charAt(0));  //  index 0 ilk harf demek c yazar
		
		// length() methodu 
		
		//kaç karakterden oluþtuðunu verir
		System.out.println(str1.length());  // length = son index + 1
		

		// kullanýcýdan ismini girmesini isteyi ve isminin son harfini yazdýrýn
		
		Scanner scan=new Scanner (System.in);
		System.out.println("isim giriniz");
		String isim=scan.nextLine();
		
		int length= isim.length();    // karakter sayýsýný bulduk
		System.out.println(isim.charAt(length-1));  //uzunluk -1 son karakteri verir
		
	
		
		
		
		scan.close();
		
	}

}
