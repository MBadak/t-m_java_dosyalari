package day05operators;

public class Concatenation01 {

	public static void main(String[] args) {
		// Concatenation demek stringleri yan yana yapýþýk gösterir.

		System.out.println("Ali" + "Can");

		System.out.println("Ali " + "Can"); // aliden sonra bir boþluk var

		System.out.println("Ali" + " Can"); // can ýn önünde bir boþluk var

		System.out.println("Ali" + " " + "Can");

		System.out.println("3" + "4"); // 34

		System.out.println(3 + "4"); // en az birisi string ise concatenation yapar

		System.out.println(2 + 5 + "4"); // java soldan saða çalýþýr 2+5=7 7 ve"4" =74

		System.out.println("2" + 5 + 4); // java soldan saða çalýþýr "2"+5 =25 "25"+4=254

		System.out.println("2" + (5 + 4)); // java iþlem önceliðini bilir sonuç 29

		System.out.println(2 + 5 + "4" + 6); //

		System.out.println(2 + 5 + "4" + 6 / 2);

		System.out.println("2*3" + 4 + 5);

		int numA = 2;
		int numB = 3;
		String str1 = "Study";
		String str2 = "Hard";
		// Ekran ciktisi 61 Study-1

		System.out.println((numB * numA) + "" + (numB - numA) + " " + str1 + (numA - numB) + str2);

	}

}
