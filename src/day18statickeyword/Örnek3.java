package day18statickeyword;

public class �rnek3 {
	
      static int x=10;

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		�rnek3 t1 = new �rnek3();
		�rnek3 t2 = new �rnek3();
		
		t1.x=20;
		System.out.print(t1.x+ " "); 
		System.out.println(t2.x);
	}

}
