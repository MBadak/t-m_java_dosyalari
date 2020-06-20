package day20arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// Bir integerin array’in elemanlarini kucukten buyuge diziniz 
		// ve ekrana iki durumu da yazdiriniz
		
		int arr[]= {2,11,0,23,7};
		System.out.println("Sýralamadan önce :"+Arrays.toString(arr));
		
		Arrays.sort(arr);  // .sort() direk sýralar.
		
		System.out.println("Sýralamadan sonra :"+Arrays.toString(arr));
		

		
		// Soru.  charlardan olusan bir Arrays oluþturunuz. asending order yapýnýz.
		
		
		
		char carr[]= {'k','p','2','d','z','x'};
		System.out.println("Sýralamadan önce :"+Arrays.toString(carr));
		Arrays.sort(carr);
		System.out.println("Sýralamadan sonra :"+Arrays.toString(carr));
		
		
		
		// Soru.  Stringlerden olusan bir Arrays oluþturunuz. asending order yapýnýz
		
		String arrSt[]= {"ali","veli","atlý","deniz","123"};
		System.out.println("Sýralamadan önce :"+Arrays.toString(arrSt));
		Arrays.sort(arrSt);
		System.out.println("Sýralamadan sonra :"+Arrays.toString(arrSt));
		
	}

}
