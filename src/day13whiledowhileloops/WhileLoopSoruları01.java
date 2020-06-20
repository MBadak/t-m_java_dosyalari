package day13whiledowhileloops;

public class WhileLoopSoruları01 {

	public static void main(String[] args) {
		// 8 den 180 e kadar 5 in kati olan tum tamsayýlarý ekrana yazdýrýnýz.
		// hem for loop hem de while loop kullanarak çözünüz.

		int num = 8;
		for (int i = num; i < 181; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
			}

		}
		System.out.println();

		while (num < 181) {
			if (num % 5 == 0) {
				System.out.print(num + " ");
			}
			num++;
		}
	}

}
