package day22arraylist;

public class ForEachLoopSoruları03 {

	public static void main(String[] args) {

//		Ýki String array oluþturunuz ve bu array’lerdeki ortak elemanlarý
//		For-each loop kullanarak bulunuz. Sonucu ekrana yazdýrýnýz.
//		Ortak eleman yoksa ekrana “Ortak eleman yok” yazdýrýnýz

		String arr1[] = { "ali", "veli", "betül","ayþe", "zeynep", "can" };
		String arr2[] = { "ali","zeynep", "þadi", "leyla", "can", "betül" };
		int a=0;
		for (String w : arr1) {
			for (String z : arr2) {
				if (w == z) {
					System.out.println(w);
					a++;
				}
			}
		}if (a<=0) {
			System.out.println("Ortak eleman yoktur");
		}
	

	}

}
