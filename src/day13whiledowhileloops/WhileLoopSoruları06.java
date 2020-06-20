package day13whiledowhileloops;

import java.util.Scanner;

public class WhileLoopSoruları06 {

	public static void main(String[] args) {
	/* Kullanýcýdan bir String alýn 
       bu String’in icinde “a” harfi varsa “a” harfinin 
       ilk görünümünün  indexini ekrana yazdýrýn.
	   “a” harfi yoksa ekrana “a harfi yok” yazdýrýn. */
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Lütfen bir cümle yazýnýz");
		String str=scan.nextLine();
		System.out.println("Cümleniz :" +str);
		String strk=str.toLowerCase();
		int str1=strk.indexOf('a');
		
		if (str1>=0) {
			System.out.println("a harfinin index numarasý :" + str1);
		}else {
			System.out.println("Cümlenizde hiç a harfi yok");
		}
		scan.close();
		
	}

	

}
