package day13whiledowhileloops;

import java.util.Scanner;

public class WhileLoopSoruları04 {

	public static void main(String[] args) {
		/* Kullanýcýdan uzunluðu çift sayý olan bir String alýn 
		 * ve bu String’in ilk yarýsýný ekrana yazdýrýn.
		 * Ornegin; Kullanýcý “Hollanda” girerse ekrana “Holl” yazdýracaksýnýz. *
*/
		Scanner scan=new Scanner (System.in);
		System.out.println("Lütfen bir kelime giriniz");
		String str=scan.nextLine();
		
		int uz= str.length()-1;
		int i=0;
		while (i<uz/2+1) {
			System.out.print(str.charAt(i));
			i++;
		}
		
		scan.close();		
	}

}
