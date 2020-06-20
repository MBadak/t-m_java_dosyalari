package day11stringmethod;

public class StringMethods04 {

	public static void main(String[] args) {

		           // valueOf() methodu
		
		// rakamlarla olu�turulan stringleri say�ya d�n��t�r�r
		// b�ylece matematiksel i�lem yapabiliriz
		// hem string hem de int de var
		String paraErkek = "1900";
		String paraKad�n = "2000";
		// ailenin geliri nedir
		System.out.println(paraErkek + paraKad�n); // 19002000
		System.out.println(Integer.valueOf(paraErkek) + Integer.valueOf(paraKad�n)); // 3900

		int maasErkek = 1900;
		int maasKad�n = 2000;
		// maasErkek ve maasKad�n say�lar�n� strige d�n��t�r ve birle�ik yazd�r.
		System.out.println(maasErkek + maasKad�n); // 3900
		System.out.println(String.valueOf(maasErkek) + String.valueOf(maasKad�n)); // 19002000

	}

}
