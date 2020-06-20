package day23date;

import java.time.LocalDate;

public class Date02 {

	public static void main(String[] args) {
		// date Manupulation date �zerinde de�i�im yapmak
		// local date den obje olu�turmam�z laz�m

		LocalDate date = LocalDate.now();
 
		 // g�n eklemek
		date.plusDays(1);      
		System.out.println(date);  // bug�n
		System.out.println(date.plusDays(1));  // 1 g�n sonra
		System.out.println(date.plusDays(15)); // 15 g�n sonra
		System.out.println(date.plusDays(-1)); // 1 g�n �ncesine gider ama �ok kullan�lmaz ba�ka metodu var
		
		// ay eklemek
		date.plusMonths(2);
		System.out.println(date.plusMonths(2)); // 2 ay sonra
		
		// g�n ��karmak
		date.minusDays(2);
		
		System.out.println(date.minusDays(2));// 2 g�n �nce
		System.out.println(date.minusMonths(2)); // 2 ay �nce
		
	}

}
