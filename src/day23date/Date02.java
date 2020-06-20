package day23date;

import java.time.LocalDate;

public class Date02 {

	public static void main(String[] args) {
		// date Manupulation date üzerinde deðiþim yapmak
		// local date den obje oluþturmamýz lazým

		LocalDate date = LocalDate.now();
 
		 // gün eklemek
		date.plusDays(1);      
		System.out.println(date);  // bugün
		System.out.println(date.plusDays(1));  // 1 gün sonra
		System.out.println(date.plusDays(15)); // 15 gün sonra
		System.out.println(date.plusDays(-1)); // 1 gün öncesine gider ama çok kullanýlmaz baþka metodu var
		
		// ay eklemek
		date.plusMonths(2);
		System.out.println(date.plusMonths(2)); // 2 ay sonra
		
		// gün çýkarmak
		date.minusDays(2);
		
		System.out.println(date.minusDays(2));// 2 gün önce
		System.out.println(date.minusMonths(2)); // 2 ay önce
		
	}

}
