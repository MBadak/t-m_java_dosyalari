package day05operators;

public class Increment01 {

	public static void main(String[] args) {
		// int data type nde bir variable olu�tur.
		// birinciyi 3 ikinciyi 7 art�r�n

		// 1. yol uzun yol

		int sy1 = 12;
		System.out.println(sy1);
		sy1 = sy1 + 3;
		System.out.println(sy1);

		int sy2 = 11;
		System.out.println(sy2);
		sy2 = sy2 + 7;
		System.out.println(sy2);

		// 2. yol k�sa

		int say1 = 12;
		say1 += 3;

		System.out.println(say1);

		int say2 = 20;
		say2 += 7;
		System.out.println(say2);

	}

}
