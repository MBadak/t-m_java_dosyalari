package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
		// Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n
		// ve ba�lang�� de�erinden veya sonras�ndan ba�lay�p
		// biti� de�erinde veya �ncesinde biten
		// t�m 3 ile b�l�nebilen tamsay�lar� ekrana yazd�r�n.

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir ba�lang�� de�eri girimiz");
		int ba�lang�� = scan.nextInt();

		System.out.println("L�tfen biti� de�erini giriniz");
		int biti� = scan.nextInt();

		System.out.println("ba�lang�� de�eri :" + ba�lang��);
		System.out.println("biti� de�eri  :" + biti�);

		if (ba�lang�� >= biti�) {
			System.out.println("ba�lan��� de�eri k���k olmal�");
		} else {
			for (int i = ba�lang��; i < biti�; i++) {
				if (i % 3 == 0) {
					System.out.print(i+" ");
				}
					
				
			}
			scan.close();

		}
	}

}
