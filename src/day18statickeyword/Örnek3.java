package day18statickeyword;

public class Örnek3 {
	
      static int x=10;

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Örnek3 t1 = new Örnek3();
		Örnek3 t2 = new Örnek3();
		
		t1.x=20;
		System.out.print(t1.x+ " "); 
		System.out.println(t2.x);
	}

}
