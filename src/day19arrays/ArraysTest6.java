package day19arrays;

public class ArraysTest6 {

	public static void main(String[] args) {

		/*
		 * Bir array�de herhangi iki eleman�n ayn� olup olmad���n� kontrol eden bir
		 * program yaz�n�z. Ayn� eleman varsa �Ayn� eleman var� yoksa �Ayn� eleman yok�
		 * yazd�r�n�z.
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
			System.out.println("Ayn� eleman var");
			System.out.println(b / 2 + " tane ayn� eleman var");

		} else {
			System.out.println("Ayn� eleman yok");
		}
	}
}
