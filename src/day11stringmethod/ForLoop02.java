package day11stringmethod;

public class ForLoop02 {

	public static void main(String[] args) {
		// 100 den küçük 3 ün katý olan sayýlarý ekrana yan yana yazdýran for Loop
		// oluþturun

		for (int i = 3; i < 100; i += 3) {
			System.out.print(i + " ");
		}
		System.out.println();

		// ilk 5 sayma sayýsýnýn toplamýný veren proðramý for loop ile yapýnýz.
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			sum = sum + i;

		}
		System.out.println(sum); // bunu } nun dýþýna yazýyoruz en son sonucu yazsýn diye

		// 10 dan büyük ilk 3 syama sayýsýnýn toplamýný veren for loop yzýnýz
		System.out.println();
		int top = 0;
		for (int i = 11; i < 14; i++) {
			top = top + i;
		}
		System.out.println(top);

		// 20 den büyük ilk 5 sayma sayýsýnýn toplamýný veren for loop oluþturunuz

		int sum3 = 0;
		for (int i = 21; i < 26; i++) {
			sum3 = sum3 + i;

		}
		System.out.println("toplam=" + sum3);

		// ilk 50 sayma sayýsýnýn toplamýný veren for loop oluþturnuz

		int sum4 = 0;
		for (int i = 1; i < 51; i++) {
			sum4 = sum4 + i;
		}
		System.out.println("toplam : " + sum4);

		// 5 ile bölünebilen 100 den küçük sayma sayýlarýnýn toplamýný veren for loop
		// oluþturun

		int sum5 = 0;
		for (int i = 0; i < 100; i += 5) {
			sum5 = sum5 + i;

		}
		System.out.println(sum5);

		
		
	}

}
