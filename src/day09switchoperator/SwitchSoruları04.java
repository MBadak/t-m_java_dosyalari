package day09switchoperator;

import java.util.Scanner;

public class SwitchSoruları04 {

	public static void main(String[] args) {
//		Kullanýcýdan ay ismi alýn
//		eðer ay ismi  31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdýrýn. 
//		Eðer ay ismi  30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdýrýn. 
//		Eðer ay ismi  28 veya 29 çeken aylardan biri ise ekrana “Bu ay Þubat ayýdýr” yazdýrýn. 
//		Bu isimlerin dýþýndaki isimler için “Geçersiz ay ismi” yazdýrýn.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir ay giriniz");

		String ay = scan.nextLine().toLowerCase();

		switch (ay) {
		 case "ocak":
         case "mart":
         case "mayis":
         case "temmuz":
         case "agustos":
         case "ekim":
         case "aralik":
             System.out.println(ay + " ayi 31 gundur.");
             break;
         case "nisan":
         case "haziran":
         case "eylul":
         case "kasim":
             System.out.println(ay + " ayi 30 gundur.");
             break;
         case "subat":
             System.out.println(ay + " ayi 28 gundur. 4 yilda bir 29 ceker.");
             break;
         default:
             System.out.println("Gecersiz ay ismi girdiniz. Lutfen kontrol ediniz.");

		}

		scan.close();

	}

}
