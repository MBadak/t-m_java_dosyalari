package day10Stringmethods;

import java.util.Scanner;

public class StringMethod03 {

	public static void main(String[] args) {
		
		// charAt() metodu
		
		// belli indeksteki karaeketri g�sterir.
		
		String str1="cimbombom";
		
		// str1 in 4. indexteki karekteri yazan pro�ram yaz�n�z
		
		System.out.println(str1.charAt(4));  //  index i 4 olan 'o' harfidir
		System.out.println(str1.charAt(0));  //  index 0 ilk harf demek c yazar
		
		// length() methodu 
		
		//ka� karakterden olu�tu�unu verir
		System.out.println(str1.length());  // length = son index + 1
		

		// kullan�c�dan ismini girmesini isteyi ve isminin son harfini yazd�r�n
		
		Scanner scan=new Scanner (System.in);
		System.out.println("isim giriniz");
		String isim=scan.nextLine();
		
		int length= isim.length();    // karakter say�s�n� bulduk
		System.out.println(isim.charAt(length-1));  //uzunluk -1 son karakteri verir
		
	
		
		
		
		scan.close();
		
	}

}
