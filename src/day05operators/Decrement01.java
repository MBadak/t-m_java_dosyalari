package day05operators;

public class Decrement01 {

	public static void main(String[] args) {
		// int data type de bir varible oluþtur,
		// bu varible her seferinde 1 azaltmak için 3 yöntemide kullanýn

		int num1 = 100;

		System.out.println(num1);
		num1 = num1 - 1; // uzun yol
		System.out.println(num1);
		num1 -= 1; // kýsa yol
		System.out.println(num1);
		num1--; // en kýsa yol
		System.out.println(num1);

	}

}
