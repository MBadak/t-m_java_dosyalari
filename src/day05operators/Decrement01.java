package day05operators;

public class Decrement01 {

	public static void main(String[] args) {
		// int data type de bir varible olu�tur,
		// bu varible her seferinde 1 azaltmak i�in 3 y�ntemide kullan�n

		int num1 = 100;

		System.out.println(num1);
		num1 = num1 - 1; // uzun yol
		System.out.println(num1);
		num1 -= 1; // k�sa yol
		System.out.println(num1);
		num1--; // en k�sa yol
		System.out.println(num1);

	}

}
