package day11stringmethod;

public class StringMethods04 {

	public static void main(String[] args) {

		           // valueOf() methodu
		
		// rakamlarla oluþturulan stringleri sayýya dönüþtürür
		// böylece matematiksel iþlem yapabiliriz
		// hem string hem de int de var
		String paraErkek = "1900";
		String paraKadýn = "2000";
		// ailenin geliri nedir
		System.out.println(paraErkek + paraKadýn); // 19002000
		System.out.println(Integer.valueOf(paraErkek) + Integer.valueOf(paraKadýn)); // 3900

		int maasErkek = 1900;
		int maasKadýn = 2000;
		// maasErkek ve maasKadýn sayýlarýný strige dönüþtür ve birleþik yazdýr.
		System.out.println(maasErkek + maasKadýn); // 3900
		System.out.println(String.valueOf(maasErkek) + String.valueOf(maasKadýn)); // 19002000

	}

}
