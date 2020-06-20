package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperatorSoruları01 {

	public static void main(String[] args) {
//	1) Kullanýcýdan bir tamsayý girmesini isteyin, 
//	tamsayý çift ise ekrana “Çift” 
//	tek ise ekrana “Tek” yazdýrýn.
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Bir tam sayi giriniz");
		int num=scan.nextInt();
		
		String sayý= num%2==0 ?  "Çift" :"Tek" ;
		System.out.println(num + " :"+ sayý+ "tir");
		
		
		
		scan.close();
	}

}
