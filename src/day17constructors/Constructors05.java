package day17constructors;

public class Constructors05 {
	
	

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Constructors04 obj1=new Constructors04();
		System.out.println(obj1.num1);
		System.out.println(obj1.num2);         //obje ile �a��r�nca num2 static oldu�undan sar� uyar� verdi
		System.out.println(Constructors04.num2); // class ismi ile �a��rmay� java be�endi
		
	}

}
