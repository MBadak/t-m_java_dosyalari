package day13whiledowhileloops;

public class Whileloop01 {

	public static void main(String[] args) {

		// while loop kullanarak ilk 5 sayma say�s�n�n toplam�n� ekrana yazd�ran
		// pro�ram� yaz�n�z

		int sum = 0;
		int i = 1;
		while (i < 6) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);

	}

}
