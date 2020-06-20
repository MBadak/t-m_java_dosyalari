package day18statickeyword;

public class Örnek6 {

	static int i = 1;

	public static void main(String[] args) {

		int i = 1;

		System.out.print("Static    ");
		System.out.println("instance");

		for (Örnek6.i = 1; Örnek6.i < 10; Örnek6.i++) {
			i = i + 2;

			System.out.print("   " +Örnek6.i+ "          ");
			System.out.println(i );

		}

	}

}
