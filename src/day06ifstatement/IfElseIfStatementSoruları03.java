package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatementSoruları03 {

	public static void main(String[] args) {

//		Kullanýcýdan notunu alýn ve
//		aþaðýdaki kurallara göre ekrana A, B, C veya D yazdýrýn. 
//		1. 50 den az - D    
//		2. 50(dahil) ile 60 arasý - C      
//		3. 60(dahil) ile 80 arasý - B.     
//		4. 80(dahil) ustu- A	

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Notunuzu giriniz");
		int num1 = scan.nextInt();

		if (num1 < 0 || num1 > 100) {
			System.out.println("Lütfen notunuzu doðru giriniz");
		} else if (num1 < 50) {
			System.out.println("D");
		} else if (num1 < 60) {
			System.out.println("C");
		} else if (num1 < 80) {
			System.out.println("B");
		} else {
			System.out.println("A");
		}
		scan.close();
	}

}