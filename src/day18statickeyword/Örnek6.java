package day18statickeyword;

public class �rnek6 {

	static int i = 1;

	public static void main(String[] args) {

		int i = 1;

		System.out.print("Static    ");
		System.out.println("instance");

		for (�rnek6.i = 1; �rnek6.i < 10; �rnek6.i++) {
			i = i + 2;

			System.out.print("   " +�rnek6.i+ "          ");
			System.out.println(i );

		}

	}

}
