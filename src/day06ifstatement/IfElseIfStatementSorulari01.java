package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatementSorulari01 {

	public static void main(String[] args) {
//		Kullan�c�dan bir tamsay� al�n 
//		e�er;
//		tamsay� 0 dan kucuk ise ekrana �Negatif� yazd�r�n. 
//		0 ise ekrana �N�tr� yazd�r�n.
//		0 dan b�y�k ise ekrana �Pozitif� yazd�r�n

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir tam say� giriniz");
		int num1 = scan.nextInt();

		if (num1 < 0) {
			System.out.println(num1 + " :Negatif");
		} else if (num1 == 0) {
			System.out.println(num1 + " :N�tr");
		} else {
			System.out.println(num1 + " :Pozitif");
		}
		scan.close();
	}

}
