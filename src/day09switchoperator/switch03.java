package day09switchoperator;

import java.util.Scanner;

public class switch03 {

	public static void main(String[] args) {
		// Kullanici gün ismini girsin
		// Program kacinci günoldugunu ekrana yazsin
		// Buyuk harf kucuk harf hepsi icin calissin
		// Yanlis ay ismi girerse “Gecerli gün ismi giriniz”
		
     Scanner scan= new Scanner(System.in);
     
		System.out.println("lütfen gün giriniz");
		
		String gün=scan.next();
		
		
		gün= gün.toLowerCase();  // toLowerCase() strigleri küçük harfe cevirmek için kullanýlýr.
		                         // toUpperCase() strigleri büyük harfe cevirmek için kullanýlýr.
		
		switch (gün) {
		case "pazartesi" :
			System.out.println("1. gün");
		break;
		case "salý" :
			System.out.println("2. gün");
		break;
		case "çarþamba" :
			System.out.println("3. gün");
		break;
		case "perþembe" :
			System.out.println("4. gün");
		break;
		case "cuma" :
			System.out.println("5. gün");
		break;
		case "cumartesi" :
			System.out.println("6. gün");
		break;
		case "pazar" :
			System.out.println("7. gün");
		break;
		default:
			System.out.println("geçerli gün giriniz");
		
		scan.close();
		}
		
	}

}
