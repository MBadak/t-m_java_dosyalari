package day23date;

import java.time.LocalTime;

public class Date03 {

	public static void main(String[] args) {
		//time Maniplation    Zaman� de�i�tir
		
		LocalTime time = LocalTime.now();
		System.out.println(LocalTime.now());
		
		// saat ekle 
		System.out.println(time.plusHours(1)); // 1 saat sonra
		System.out.println(time.plusMinutes(15)); // 15 dakika sonra
		System.out.println(time.plusSeconds(30)); // 30 saniye sonra
		
		// saat ��kar
		System.out.println(time.minusHours(3));    // 3 saat �nce
		System.out.println(time.minusMinutes(15)); //15 dakika �nce
		System.out.println(time.minusSeconds(45)); // 45 saniye �nce
		
		System.out.println(LocalTime.now());

	}

}
