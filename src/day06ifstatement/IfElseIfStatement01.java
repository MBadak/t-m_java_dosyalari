package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement01 {

	public static void main(String[] args) {
		// Kullanicidan yasini alin
		// Yas 13 den az ise ekrana �Calisamaz� yazdirin
		// Yas 13 den 65 e kadar ise ekrana �Calisabilir� yazdirin
		// Yas 65 den buyuk ise ekrana �Emekli� yazdirin
		// negatif girerse ya� negatif olamaz

		Scanner sc = new Scanner(System.in);
		System.out.println("l�tfen ya��n�z� giriniz.");
		int ya� = sc.nextInt();

		if (ya� < 0) {
			System.out.println("ya� negatif olamaz");
		} else

		if (ya� < 13) {
			System.out.println("�al��amaz");
		} else if (ya� <= 65) {
			System.out.println("�al��abilir");
		} else {
			System.out.println("emekli");
		}

		sc.close();

	}

}
