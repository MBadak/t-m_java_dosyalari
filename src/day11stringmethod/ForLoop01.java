package day11stringmethod;

public class ForLoop01 {

	public static void main(String[] args) {
		// 4,3,2 yi ekrana yazd�ran bir for loop olu�turunuz

		for (int i = 4; i > 1; i--) {
			System.out.println(i);
		}

		// 4,3,2,1,0,-1 yi ekrana yazd�ran bir for loop olu�turunuz

		for (int i = 4; i > -2; i--) {
			System.out.println(i);
		}

		// 3 ,4,5,6,7, ekrana yazd�ran for lopp olu�turunuz

		for (int i = 3; i < 8; i++) {
			System.out.println(i);
		}
		// ilk y�z sayma say�s�n� 1 den 100 e kadar ekrana yan yana yazd�ra ve aralar�na
		// bao�luk koyan pro�ram� for op kullanarak yazd�r

		for (int i = 1; i < 101; i++) {
			System.out.print(i + " ");
		}

		// ilk y�z sayma say�s�n� 100 den 1 e kadar ekrana yan yana yazd�ra ve aralar�na
		// bao�luk koyan pro�ram� for op kullanarak yazd�r
		System.out.println();

		for (int i = 100; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		// ilk 50 �ift sayma say�s�n� ekrana yazd�ran pro�ram� yap�n�z

		for (int i = 2; i < 101; i = i + 2) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 1,3,5, .....99 yazd�r�n

		for (int i = 1; i < 100;  i = i + 2) {
			System.out.print(i+ ", ");
		}

	}

}
