package day11stringmethod;

public class StringMethods02 {

	public static void main(String[] args) {
		            // 1 // .substring() methodu
		
		// Bir stringin belli bir b�l�m�n� kesip almak i�in kullan�l�r.
		
		String str1 = "Java �al��ana kolayd�r";
		
		// substring() 1. versiyon 
		
		System.out.println(str1.substring(5));  // �al��ana kolayd�r(index 5 dahildir)
		System.out.println(str1.substring(8));  // isana kolayd�r
		System.out.println(str1.substring(22));  // ekranda hi�bir�ey g�z�kmez.
	//	System.out.println(str1.substring(23));  // hata 

		// substring() 2. versiyon 
		
		System.out.println(str1.substring(5, 12)); // �al��an  [5,13) 5 dahil 13 de�il
		System.out.println(str1.substring(6, 12)); // al��an
		System.out.println(str1.substring(6,6));   // bo�
	//	System.out.println(str1.substring(7,6));   // hata excepsion
		
		
	}

}
