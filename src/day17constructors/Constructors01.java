package day17constructors;

public class Constructors01 {
	String isim="Ali Can";
	int ya�=33;
			

	
	public static void main(String[] args) {
	b�y�me(33);    // main meteot ve methot ayn� class ta ise ismini yazmak (b�y�me() )yeterlidir
		
	isimDe�i�tirme("Ay�e Han");
	
	}
	
	public static void b�y�me(int ya�) {
		ya�++;
		System.out.println(ya�);
			
	}
	public static void isimDe�i�tirme(String isim) {
		System.out.println(isim);
	}
	
	
	
	
}
