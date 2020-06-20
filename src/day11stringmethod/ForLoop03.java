package day11stringmethod;

public class ForLoop03 {

	public static void main(String[] args) {

		// ilk 4 sayma sayýsýnýn çarpýmýný veren for kopp oluþturunuz

		int çarp = 1;
		for (int i = 1; i < 5; i++) {
			çarp = çarp * i;
		}
		System.out.println(çarp);

		// ilk 6 çift sayma sayýsýnýn çarpýmýný veren for lop oluþturunuz

		int çarpým = 1;
		for (int i = 2; i < 13; i = i + 2) {
			çarpým = çarpým * i;
		}

		System.out.println(çarpým);

		// 9! faktöryeli hesaplayan proð yapýnýz

		int çar = 1;
		for (int i = 9; i > 0; i--) {
			çar = çar * i;
		}
		System.out.println("9! =" + çar);

	}

}
