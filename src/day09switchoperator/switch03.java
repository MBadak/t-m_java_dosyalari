package day09switchoperator;

import java.util.Scanner;

public class switch03 {

	public static void main(String[] args) {
		// Kullanici g�n ismini girsin
		// Program kacinci g�noldugunu ekrana yazsin
		// Buyuk harf kucuk harf hepsi icin calissin
		// Yanlis ay ismi girerse �Gecerli g�n ismi giriniz�
		
     Scanner scan= new Scanner(System.in);
     
		System.out.println("l�tfen g�n giriniz");
		
		String g�n=scan.next();
		
		
		g�n= g�n.toLowerCase();  // toLowerCase() strigleri k���k harfe cevirmek i�in kullan�l�r.
		                         // toUpperCase() strigleri b�y�k harfe cevirmek i�in kullan�l�r.
		
		switch (g�n) {
		case "pazartesi" :
			System.out.println("1. g�n");
		break;
		case "sal�" :
			System.out.println("2. g�n");
		break;
		case "�ar�amba" :
			System.out.println("3. g�n");
		break;
		case "per�embe" :
			System.out.println("4. g�n");
		break;
		case "cuma" :
			System.out.println("5. g�n");
		break;
		case "cumartesi" :
			System.out.println("6. g�n");
		break;
		case "pazar" :
			System.out.println("7. g�n");
		break;
		default:
			System.out.println("ge�erli g�n giriniz");
		
		scan.close();
		}
		
	}

}
