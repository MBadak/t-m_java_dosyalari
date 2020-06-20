package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatementSorulari01 {

	public static void main(String[] args) {
//		Kullanýcýdan bir tamsayý alýn 
//		eðer;
//		tamsayý 0 dan kucuk ise ekrana “Negatif” yazdýrýn. 
//		0 ise ekrana “Nötr” yazdýrýn.
//		0 dan büyük ise ekrana “Pozitif” yazdýrýn

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir tam sayý giriniz");
		int num1 = scan.nextInt();

		if (num1 < 0) {
			System.out.println(num1 + " :Negatif");
		} else if (num1 == 0) {
			System.out.println(num1 + " :Nötr");
		} else {
			System.out.println(num1 + " :Pozitif");
		}
		scan.close();
	}

}
