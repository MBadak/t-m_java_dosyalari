package day11stringmethod;

public class ForLoop02 {

	public static void main(String[] args) {
		// 100 den k���k 3 �n kat� olan say�lar� ekrana yan yana yazd�ran for Loop
		// olu�turun

		for (int i = 3; i < 100; i += 3) {
			System.out.print(i + " ");
		}
		System.out.println();

		// ilk 5 sayma say�s�n�n toplam�n� veren pro�ram� for loop ile yap�n�z.
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			sum = sum + i;

		}
		System.out.println(sum); // bunu } nun d���na yaz�yoruz en son sonucu yazs�n diye

		// 10 dan b�y�k ilk 3 syama say�s�n�n toplam�n� veren for loop yz�n�z
		System.out.println();
		int top = 0;
		for (int i = 11; i < 14; i++) {
			top = top + i;
		}
		System.out.println(top);

		// 20 den b�y�k ilk 5 sayma say�s�n�n toplam�n� veren for loop olu�turunuz

		int sum3 = 0;
		for (int i = 21; i < 26; i++) {
			sum3 = sum3 + i;

		}
		System.out.println("toplam=" + sum3);

		// ilk 50 sayma say�s�n�n toplam�n� veren for loop olu�turnuz

		int sum4 = 0;
		for (int i = 1; i < 51; i++) {
			sum4 = sum4 + i;
		}
		System.out.println("toplam : " + sum4);

		// 5 ile b�l�nebilen 100 den k���k sayma say�lar�n�n toplam�n� veren for loop
		// olu�turun

		int sum5 = 0;
		for (int i = 0; i < 100; i += 5) {
			sum5 = sum5 + i;

		}
		System.out.println(sum5);

		
		
	}

}
