package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	public static void main(String[] args) {
		// Date tarih demek dir
		// bug�n�n tarihini ekrana yazd�ral�m
		
	//	LocalDate.now(); �imdiki tarih
		
		System.out.println("�imdiki tarih : "+LocalDate.now()); // �imdiki tarih : 2020-05-20
		
	//	LocalTime.now();  now �imdiki zaman
		System.out.println("�imdiki zaman : "+LocalTime.now()); // �imdiki zaman : 17:02:32.544
		
	// zaman ve tarih beraber
		
		System.out.println("tarih zaman : "+ LocalDateTime.now()); // tarih zaman : 2020-05-20T17:02:32.545
		
	}

}
