package day14dowhileloop;

import java.util.Scanner;

public class DoWhileSoruları5 {

	public static void main(String[] args) {
	/*Kullanýcýya bir String girmesini söyleyin 
	ve bu String’in ilk harfi ile son harfi ayný ise ekrana  “Simetrik” yazdýrýn.
	Ayný deðilse tekrar bir String girmesini isteyin. */
		
		System.out.println("Lütfen kelime giriniz");
		Scanner scan = new Scanner(System.in);
		char ilk='a';
		char son='z';
		do {
			String str=scan.nextLine();
			ilk=str.toLowerCase().charAt(0);
			son=str.toLowerCase().charAt(str.length()-1);
			
			if(ilk==son) {
				System.out.println("Simetrik");
			}else {
				System.out.println("Lütfen tekrar bir kelime giriniz");
			}									
		}while (ilk!=son);
		scan.close();
	}
}
