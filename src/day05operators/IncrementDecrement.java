package day05operators;

public class IncrementDecrement {

	public static void main(String[] args) {
		// int data type de bir varible olu�tur
		// bu variblenin degerini �arpma be b�lme kullanarak art�r�n ve azalt�n

		// �arpma i�in

		int num1 = 10;

		num1 = num1 * 3; // uzun yol deger=10*3=30
		System.out.println(num1);

		num1 *= 3; // k�sa yol deger=30*3=90
		System.out.println(num1);

		// b�lme i�in

		num1 = num1 / 3; // uzun yol 90/3=30
		System.out.println(num1);

		num1 /= 3; // k�sa yol 30/3=10
		System.out.println(num1);

	}

}
