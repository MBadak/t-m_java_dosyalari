package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview03 {

	public static void main(String[] args) {
		// kullan�c�dan bir say� al�n bu say�n�n tersten 2 fazlas�n� yazd�r�n 
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("bir say� giriniz");
		
		String num=scan.nextLine();
		
		String ters= "";
		
		for (int i=num.length()-1; i>=0 ;i--) {
			ters = ters + num.charAt(i) + "";
			
		}
	//	System.out.print(ters);
		int tersInt=Integer.valueOf(ters);
		tersInt=tersInt +2;
		System.out.println(tersInt);
	scan.close();
	}


}
