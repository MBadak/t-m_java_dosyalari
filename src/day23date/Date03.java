package day23date;

import java.time.LocalTime;

public class Date03 {

	public static void main(String[] args) {
		//time Maniplation    Zamaný deðiþtir
		
		LocalTime time = LocalTime.now();
		System.out.println(LocalTime.now());
		
		// saat ekle 
		System.out.println(time.plusHours(1)); // 1 saat sonra
		System.out.println(time.plusMinutes(15)); // 15 dakika sonra
		System.out.println(time.plusSeconds(30)); // 30 saniye sonra
		
		// saat çýkar
		System.out.println(time.minusHours(3));    // 3 saat önce
		System.out.println(time.minusMinutes(15)); //15 dakika önce
		System.out.println(time.minusSeconds(45)); // 45 saniye önce
		
		System.out.println(LocalTime.now());

	}

}
