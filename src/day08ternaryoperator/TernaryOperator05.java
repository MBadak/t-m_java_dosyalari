package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator05 {

	public static void main(String[] args) {

		// Kullanicidan bir character girmesini isteyiniz
		// Character harf ise kucuk harf olup olmadigini kontrol ediniz
		// Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
		// Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
		// Harf degilse ekrana "Harf degil" yazdiriniz

		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen bir karakter giriniz");
		char ch = scan.next().charAt(0);

		String sonuc = ((ch > 96 && ch < 123) || (ch > 64 && ch < 91))
				? (ch > 96 && ch < 123) ? "küçük harf" : "büyük harf"
				: "harf deðil";

		System.out.println(ch + " :" + sonuc + "dir");

		scan.close();
	}

}
