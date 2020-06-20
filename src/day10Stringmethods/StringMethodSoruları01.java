package day10Stringmethods;

import java.util.Scanner;

public class StringMethodSoruları01 {

	public static void main(String[] args) {
		// Kullanýcýdan kredi kartý numarasýný alýn ve bu numaranýn 
	    // üçüncü, dördüncü ve sonuncu  rakamlarýný ekrana yazdýrýn.
		Scanner sc=new Scanner (System.in);
		System.out.println("Lütfen kart numaranýzý giriniz.");
		String kartNum=sc.nextLine();
		System.out.println(kartNum);
		
		char üçüncüsayý=kartNum.charAt(2);
		char dördüncüsayý=kartNum.charAt(3);
		int hanesayý= kartNum.length();
		char sonsayý=kartNum.charAt(hanesayý-1);
		
		System.out.println("hane sayýsý :"+ hanesayý);
		System.out.println("üçüncüsayý :"+üçüncüsayý);
		System.out.println("dördüncüsayý :"+ dördüncüsayý);
		System.out.println("sonsayý :"+ sonsayý);
		
	sc.close();
	

	}

}
