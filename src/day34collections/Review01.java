package day34collections;

import java.util.Arrays;
import java.util.Scanner;

public class Review01 {

	public static void main(String[] args) {
		// Kullanicidan adini ve soyadini aliniz
				// 1)Ad ve soyadini console’a yazdirin
				// 2)Sadece adini console’a yazdirin
				// 3)Ad ve soyadinin ilk harflerini console’a yazdirin
				// 4)Ad ve soyadini console’a tersten yazdirin
				// 5)Ad ve soyadinda kullanilan tum karakterleri alfabetik sirada 
				//  console’a yazdirin.

		Scanner scan =new Scanner(System.in);
		System.out.println("Lütfen adinizi giriniz");
		String ad=scan.nextLine();
		System.out.println("lütfen soyadinizi giriniz");
		String soyad=scan.nextLine();
		
		System.out.println("1-Adiniz ve soyadiniz : "+ ad +" "+ soyad);
		System.out.println("2-Adiniz : "+ ad );
		System.out.println("3-Adiniz ve soyadiniz ilk harfkleri : "+ ad.substring(0,1) +" "+ soyad.substring(0,1));
		
		String isim= ad +" " +soyad;
		
		String sum="";
		
		for (int i = isim.length()-1 ; i >= 0; i--) {
			char a=isim.charAt(i);
			sum=sum+ a;
		}
		//4
		System.out.println("4--Ad ve soyadini console’a tersten yazilimi " +sum);
		
		StringBuilder str = new StringBuilder(ad+ " " +soyad);
		System.out.println("4-Stringbuelder ile Ad ve soyadini console’a tersten yazilimi :" +str.reverse());
		// 5 
		String tamAd= ad+soyad;
		String harfArr[]= tamAd.split("");
		Arrays.sort(harfArr);
		System.out.println("5-Harflaer alfabetik sirada :" + Arrays.toString(harfArr));
				
    scan.close();
		
		
 
 
	
	
	}
}
