package day33interface;

public interface Interface01 {
// sadece abstrack metot kullanilirdi java 8 den sonra conceret eklendi 
	// bununicin defeuld  veya static dememiz lazim
	
	public default void araba() {  // body li 
		System.out.println("araba iyidir");
	}
	
	public static void honda() {  //body li
		System.out.println("honda güzeldir");
	}
	
	public void toyota();
		
	
	
}
