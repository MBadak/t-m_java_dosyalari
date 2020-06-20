package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator06 {

	public static void main(String[] args) {

		// Kullanicidan bir sayi aliniz
		// Sayi cift ise 10 bolunup bolunmedigini kontrol ediniz
		// Sayi 10 a bolunuyorsa “Wooow 10” yazdiriniz, 10 a bolunmuyorsa “Yazik 10" yazdiriniz
		// Sayi tek ise 5 e bolunup bolunmedigini kontrol ediniz
		// Sayi 5 e bolunuyorsa “Wooow 5” yazdiriniz, 5 e bolunmuyorsa “Yazik 5" yazdiriniz
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen bir tam sayý giriniz");
		int num = scan.nextInt();
		
		String sonuc= num %2==0   ?  num%10==0 ? "wooow  10" 
				                               : "yazýk 10" 
			                      : num%5==0 ? "wooow 5" 
			                    		   : "yazýk 5";
 
		System.out.println(sonuc);
		
		
		scan.close();
	}

}
