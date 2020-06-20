package day11stringmethod;

public class ForLoop01 {

	public static void main(String[] args) {
		// 4,3,2 yi ekrana yazdýran bir for loop oluþturunuz

		for (int i = 4; i > 1; i--) {
			System.out.println(i);
		}

		// 4,3,2,1,0,-1 yi ekrana yazdýran bir for loop oluþturunuz

		for (int i = 4; i > -2; i--) {
			System.out.println(i);
		}

		// 3 ,4,5,6,7, ekrana yazdýran for lopp oluþturunuz

		for (int i = 3; i < 8; i++) {
			System.out.println(i);
		}
		// ilk yüz sayma sayýsýný 1 den 100 e kadar ekrana yan yana yazdýra ve aralarýna
		// baoþluk koyan proðramý for op kullanarak yazdýr

		for (int i = 1; i < 101; i++) {
			System.out.print(i + " ");
		}

		// ilk yüz sayma sayýsýný 100 den 1 e kadar ekrana yan yana yazdýra ve aralarýna
		// baoþluk koyan proðramý for op kullanarak yazdýr
		System.out.println();

		for (int i = 100; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		// ilk 50 çift sayma sayýsýný ekrana yazdýran proðramý yapýnýz

		for (int i = 2; i < 101; i = i + 2) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 1,3,5, .....99 yazdýrýn

		for (int i = 1; i < 100;  i = i + 2) {
			System.out.print(i+ ", ");
		}

	}

}
