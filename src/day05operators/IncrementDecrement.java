package day05operators;

public class IncrementDecrement {

	public static void main(String[] args) {
		// int data type de bir varible oluþtur
		// bu variblenin degerini çarpma be bölme kullanarak artýrýn ve azaltýn

		// çarpma için

		int num1 = 10;

		num1 = num1 * 3; // uzun yol deger=10*3=30
		System.out.println(num1);

		num1 *= 3; // kýsa yol deger=30*3=90
		System.out.println(num1);

		// bölme için

		num1 = num1 / 3; // uzun yol 90/3=30
		System.out.println(num1);

		num1 /= 3; // kýsa yol 30/3=10
		System.out.println(num1);

	}

}
