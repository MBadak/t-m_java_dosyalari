package day06ifstatement;

import java.util.Scanner;

public class IfElseStatementSoruları04 {

	public static void main(String[] args) {
		// Kullanýcýdan bir character alýn
		// eðer;
		// character bir harf ise ekrana “Harf” yazdýrýn.
		// Diðer durumlarda ekrana “Harf deðil” yazdýrýn.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir karakter giriniz");
		char chr = scan.next().charAt(0);

		if (chr == 'q' || chr == 'w' || chr == 'e' || chr == 'r' || chr == 't' || chr == 'y' || chr == 'u' || chr == 'ý'
				|| chr == 'o' || chr == 'p' || chr == 'ð' || chr == 'ü' || chr == 'a' || chr == 'a' || chr == 'a'
				|| chr == 's' || chr == 'd' || chr == 'f' || chr == 'g' || chr == 'h' || chr == 'j' || chr == 'k'
				|| chr == 'l' || chr == 'þ' || chr == 'i' || chr == 'z' || chr == 'x' || chr == 'c' || chr == 'v'
				|| chr == 'b' || chr == 'n' || chr == 'm' || chr == 'ö' || chr == 'ç' || chr == 'Q' || chr == 'W'
				|| chr == 'E' || chr == 'R' || chr == 'T' || chr == 'Y' || chr == 'U' || chr == 'I' || chr == 'O'
				|| chr == 'P' || chr == 'Ð' || chr == 'Ü' || chr == 'A' || chr == 'S' || chr == 'D' || chr == 'F'
				|| chr == 'G' || chr == 'H' || chr == 'J' || chr == 'K' || chr == 'L' || chr == 'Þ' || chr == 'Ý'
				|| chr == 'Z' || chr == 'X' || chr == 'C' || chr == 'V' || chr == 'B' || chr == 'N' || chr == 'M'
				|| chr == 'Ö' || chr == 'Ç') {
			System.out.println("harf");

		} else {
			System.out.println("Harf deðil");
		}

		// ??????????? sdfg harf diyor

		scan.close();

	}

}
