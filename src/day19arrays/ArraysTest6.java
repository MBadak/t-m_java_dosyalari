package day19arrays;

public class ArraysTest6 {

	public static void main(String[] args) {

		/*
		 * Bir array’de herhangi iki elemanýn ayný olup olmadýðýný kontrol eden bir
		 * program yazýnýz. Ayný eleman varsa “Ayný eleman var” yoksa “Ayný eleman yok”
		 * yazdýrýnýz.
		 */
		int arr[] = { 1, 2, 2, 4, 4, 1, 8, 9, 10, 10, };

		int b = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					continue;
				}
				if (arr[j] == arr[i]) {
					b++;
				}
			}
		}
		if (b > 0) {
			System.out.println("Ayný eleman var");
			System.out.println(b / 2 + " tane ayný eleman var");

		} else {
			System.out.println("Ayný eleman yok");
		}
	}
}
