package day32abstraction;

public interface Interface01 {
	/* interface class degildir
	 * interface'de sadece abstract method kullanilabilir
	 * methotlar abstract olamali ama abstract yazmaya gerek yok java anlar
	 * interface icindeki variable'lar mutlaka public,static ve final olmali
	 * private veya protected variable'lar compiletime error verir
	 * Interface icindeki variable'lari mutlaka initalize etmek zorundasiniz
	 * aksi halde compile time error verir.ornek: int a= 12 seklinde olmali
	 */
	 
	public void add(); // bu bir abstract methot  ama abstract yazilmamis soru degil
	
	public abstract void add1();
	
	public static final int a=12; // Vareblelar böyle olmali ama;
	int b=13;                     // java bunuda kabul eder cünkü interface icersinde oldugunda java anlar
	public int c=12;
	static int d=15;
	final int e=20;  // hepsi mümkün ve bunlarin hepsi public static final dir.
	
	
}
