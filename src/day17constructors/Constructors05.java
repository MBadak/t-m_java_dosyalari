package day17constructors;

public class Constructors05 {
	
	

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Constructors04 obj1=new Constructors04();
		System.out.println(obj1.num1);
		System.out.println(obj1.num2);         //obje ile çaðýrýnca num2 static olduðundan sarý uyarý verdi
		System.out.println(Constructors04.num2); // class ismi ile çaðýrmayý java beðendi
		
	}

}
