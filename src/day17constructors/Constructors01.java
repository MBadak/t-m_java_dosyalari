package day17constructors;

public class Constructors01 {
	String isim="Ali Can";
	int yaþ=33;
			

	
	public static void main(String[] args) {
	büyüme(33);    // main meteot ve methot ayný class ta ise ismini yazmak (büyüme() )yeterlidir
		
	isimDeðiþtirme("Ayþe Han");
	
	}
	
	public static void büyüme(int yaþ) {
		yaþ++;
		System.out.println(yaþ);
			
	}
	public static void isimDeðiþtirme(String isim) {
		System.out.println(isim);
	}
	
	
	
	
}
