package day05operators;

public class Increment04 {

	public static void main(String[] args) {
		// int data type de bir varible olu�tur,
		// bu varible her seferinde 1 art�rmak i�in 3 y�ntemide kullan�n
		//

		int say1 = 10;
		say1 = say1 + 1;

		int say2 = 20;
		say2 += 1;

		int say3 = 30;
		say3++;

		System.out.println(say1);
		System.out.println(say2);
		System.out.println(say3);

		int num1 = 100;
		System.out.println(num1);
		num1 = num1 + 1;
		System.out.println(num1);
		num1 += 1;
		System.out.println(num1);
		num1++;
		System.out.println(num1);

	}

}
