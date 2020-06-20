package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperatorSoruları02 {

	public static void main(String[] args) {
		// 2)Kullanýcýdan iki tamsayý girmesini isteyin,
		// ekrana her zaman büyük olanýný yazdýrýn
		// sayýlar eþitse "Birbirinden farklý sayýlar giriniz" yazdýrýn
		Scanner scan = new Scanner(System.in);

		System.out.println("Bir tam sayi giriniz");
		int num1=scan.nextInt();
		
		System.out.println("Bir tam sayi daha giriniz");
		int num2=scan.nextInt();
		
		System.out.println(  num1==num2 ? "Birbirinden farklý sayýlar giriniz" 
				:"büyük olan sayý ="+( num1<num2 ? num2 : num1) );
		
		scan.close();
	} 

}
