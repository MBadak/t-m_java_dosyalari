package day09switchoperator;

import java.util.Scanner;

public class SwitchSoruları03 {

	public static void main(String[] args) {
//		Kullanýcýdan bir tamsayý alýn eðer tamsayý 
//		9 ise ekrana “Bir basamaklý en büyük sayý” yazdýrýn. 
//		99 ise ekrana “Ýki basamaklý en büyük sayý” yazdýrýn. 
//		999 ise ekrana “Üç basamaklý en büyük sayý” yazdýrýn. 
//		Bu sayýlarýn dýþýndaki sayýlar için “Yorum yok” yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir tam sayý giriniz");
		
		int num=scan.nextInt();
		
		switch (num) {
		case (9):
			System.out.println(num +" :Bir basamaklý en büyük sayý");
		break;
		case (99):
			System.out.println(num +" :Ýki basamaklý en büyük sayý");
		break;
		case (999):
			System.out.println(num +" :Üç basamaklý en büyük sayý");
		break;
		default:
			System.out.println("Yorum yok");
		
		scan.close();
		}
		
		
	}

}
