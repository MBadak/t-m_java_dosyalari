package day23date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date04 {

	public static void main(String[] args) {
		// Date formatýný deðiþmek
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
	  DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		
	  dtf.format(date);
	  System.out.println(dtf.format(date));
	  
	  DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
	  System.out.println(dtf1.format(date));
	  
	  // time format deðiþtirmek
	  LocalTime time = LocalTime.now();
	  System.out.println(time);
	  
	  DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("hh:mm"); // HH olursa 24 lük dilimi kullanýr
	  
	  dtf3.format(time);
	  System.out.println(dtf3.format(time));
	  
	  
	  
	}

}
