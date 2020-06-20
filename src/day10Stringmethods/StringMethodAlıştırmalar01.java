package day10Stringmethods;

public class StringMethodAlıştırmalar01 {

	public static void main(String[] args) {
//		//Aþaðýdaki kodlarýn ekran çýktýsý alýnýrsa
//		ne olur diye once dusunun 
//		sonra kodlarý yazarak  ekran çýktýlarýna bakýn.
		String str = "Cat, caterpillar";
		System.out.println(str.lastIndexOf("a")); // 14
		System.out.println(str.lastIndexOf("at")); // 1
		System.out.println(str.lastIndexOf("s")); // -1
		System.out.println(str.lastIndexOf("CAT")); // -1
		System.out.println(str.lastIndexOf("pars")); // -1
		System.out.println(str.lastIndexOf("a", 3)); // 1
		System.out.println(str.lastIndexOf("a", 5)); // 1
		System.out.println(str.lastIndexOf("at", 2)); // 1
		System.out.println(str.lastIndexOf("at", 7)); // 6
		System.out.println(str.toUpperCase()); // CAT, CATERPÝLLAR
		System.out.println(str.toLowerCase()); // cat, caterpillar
		System.out.println(str.substring(4).toLowerCase()); // ,
		System.out.println(str.substring(2, 8).toUpperCase()); // T, CAT
		System.out.println(str.toUpperCase().toLowerCase()); // cat, caterpillar

		String str1 = "";
		System.out.println(str1.isEmpty()); // true
		String str2 = "  ";
		System.out.println(str2.isEmpty()); // false
		String str3 = "Almanya";
		System.out.println(str3.isEmpty()); // false

		String strA = "Cat   ";
		System.out.println(strA.trim());          //Cat
		System.out.println(strA.contains("a"));   //True
		String strB = "  Cat";
		System.out.println(strB.trim());          //Cat
		System.out.println(strB.contains(" "));   //True
		String strC = "   Cat   ";
		System.out.println(strC.trim());          //Cat
		System.out.println(strC.contains(""));    //False

	}

}
