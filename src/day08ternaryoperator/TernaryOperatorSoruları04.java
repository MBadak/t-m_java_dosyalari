package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperatorSoruları04 {

	public static void main(String[] args) {
		//Kullanýcýdan bir dikdörtgenin en ve boyunu girmesini isteyin.
		//En ve boy eþit ise ekrana “Kare”
		//farklý ise ekrana “Dikdörtgen” yazdýrýn
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Dikdörtgenin enini giriniz");
		int num1=scan.nextInt();
		
		System.out.println("Dikdörtgenin boyunu giriniz");
		int num2=scan.nextInt();
		
		System.out.println( (num1>0 && num2>0) ?   num1==num2 ? "kare" 
				                                              : "dikdörtgen" 
			                                   : "uzunluk 0 veya eksi olamaz");
		
		
		
		
		
		scan.close();

	}

}
