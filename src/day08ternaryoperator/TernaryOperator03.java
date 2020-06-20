package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {
		// Kullanicidan iki sayi aliniz
	    // Kucuk sayiyi ekrana yazdiriniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen bir tam sayý giriniz");
		int num1 = scan.nextInt();

		System.out.println("lütfen bir tam sayý giriniz");
		int num2 = scan.nextInt();

		if (num1!=num2 ) {
			int sonuc= num1>num2 ?  num2  :  num1;
			System.out.println(sonuc);
		}else { 
			System.out.println("farklý sayýlar giriniz");
		}
		
		
		scan.close();
	}

}
