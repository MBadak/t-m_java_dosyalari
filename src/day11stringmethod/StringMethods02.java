package day11stringmethod;

public class StringMethods02 {

	public static void main(String[] args) {
		            // 1 // .substring() methodu
		
		// Bir stringin belli bir bölümünü kesip almak için kullanýlýr.
		
		String str1 = "Java çalýþana kolaydýr";
		
		// substring() 1. versiyon 
		
		System.out.println(str1.substring(5));  // çalýþana kolaydýr(index 5 dahildir)
		System.out.println(str1.substring(8));  // isana kolaydýr
		System.out.println(str1.substring(22));  // ekranda hiçbirþey gözükmez.
	//	System.out.println(str1.substring(23));  // hata 

		// substring() 2. versiyon 
		
		System.out.println(str1.substring(5, 12)); // çalýþan  [5,13) 5 dahil 13 deðil
		System.out.println(str1.substring(6, 12)); // alýþan
		System.out.println(str1.substring(6,6));   // boþ
	//	System.out.println(str1.substring(7,6));   // hata excepsion
		
		
	}

}
