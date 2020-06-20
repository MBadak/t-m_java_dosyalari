package day13whiledowhileloops;

public class Whileloop01 {

	public static void main(String[] args) {

		// while loop kullanarak ilk 5 sayma sayýsýnýn toplamýný ekrana yazdýran
		// proðramý yazýnýz

		int sum = 0;
		int i = 1;
		while (i < 6) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);

	}

}
