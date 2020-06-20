package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	public static void main(String[] args) {
		// Date tarih demek dir
		// bugünün tarihini ekrana yazdýralým
		
	//	LocalDate.now(); þimdiki tarih
		
		System.out.println("Þimdiki tarih : "+LocalDate.now()); // Þimdiki tarih : 2020-05-20
		
	//	LocalTime.now();  now þimdiki zaman
		System.out.println("Þimdiki zaman : "+LocalTime.now()); // Þimdiki zaman : 17:02:32.544
		
	// zaman ve tarih beraber
		
		System.out.println("tarih zaman : "+ LocalDateTime.now()); // tarih zaman : 2020-05-20T17:02:32.545
		
	}

}
