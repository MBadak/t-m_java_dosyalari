package day20arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// Bir integerin array�in elemanlarini kucukten buyuge diziniz 
		// ve ekrana iki durumu da yazdiriniz
		
		int arr[]= {2,11,0,23,7};
		System.out.println("S�ralamadan �nce :"+Arrays.toString(arr));
		
		Arrays.sort(arr);  // .sort() direk s�ralar.
		
		System.out.println("S�ralamadan sonra :"+Arrays.toString(arr));
		

		
		// Soru.  charlardan olusan bir Arrays olu�turunuz. asending order yap�n�z.
		
		
		
		char carr[]= {'k','p','2','d','z','x'};
		System.out.println("S�ralamadan �nce :"+Arrays.toString(carr));
		Arrays.sort(carr);
		System.out.println("S�ralamadan sonra :"+Arrays.toString(carr));
		
		
		
		// Soru.  Stringlerden olusan bir Arrays olu�turunuz. asending order yap�n�z
		
		String arrSt[]= {"ali","veli","atl�","deniz","123"};
		System.out.println("S�ralamadan �nce :"+Arrays.toString(arrSt));
		Arrays.sort(arrSt);
		System.out.println("S�ralamadan sonra :"+Arrays.toString(arrSt));
		
	}

}
