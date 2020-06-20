package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator02 {

	public static void main(String[] args) {
		// Kullanicidan iki sayi alin
		// Bu sayilar birbirine esit ise toplamlarini ekrana yazdirin
		// Bu sayilar birbirinden farkli ise carpimlarini ekrana yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen bir tam sayý giriniz");
		int num1 = scan.nextInt();

		System.out.println("lütfen bir tam sayý giriniz");
		int num2 = scan.nextInt();

		int sonuc1 = num1 == num2 ? (num1 + num2) : (num1 * num2);

		System.out.println(sonuc1);

		scan.close();

	}

}
