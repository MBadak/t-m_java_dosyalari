package day11stringmethod;

public class ForLoop03 {

	public static void main(String[] args) {

		// ilk 4 sayma say�s�n�n �arp�m�n� veren for kopp olu�turunuz

		int �arp = 1;
		for (int i = 1; i < 5; i++) {
			�arp = �arp * i;
		}
		System.out.println(�arp);

		// ilk 6 �ift sayma say�s�n�n �arp�m�n� veren for lop olu�turunuz

		int �arp�m = 1;
		for (int i = 2; i < 13; i = i + 2) {
			�arp�m = �arp�m * i;
		}

		System.out.println(�arp�m);

		// 9! fakt�ryeli hesaplayan pro� yap�n�z

		int �ar = 1;
		for (int i = 9; i > 0; i--) {
			�ar = �ar * i;
		}
		System.out.println("9! =" + �ar);

	}

}
