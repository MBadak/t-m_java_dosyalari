package day29polymorphismexception;

public class Polymorphism01 {

	public static void main(String[] args) {
		// Polymorphism ==> coklu yapi
		// bir methodu overloding ve overriding ile bir methot polymorphism hale gelir
		// Polymorphism'i Overloading ile yaparsaniz "Compile Time Polymorphism" denir.
		//                Diger adi static polymorphim'dir.
		// Polymorphism'i Overriding ile yaparsaniz "Run Time Polymorphism" denir.
		//                Diger adi dinamic polymorphism'dir.

		

	}
	public void eat() {
		System.out.println("ye");
	}
	//overloding ile polimorphism yaptik
	public void eat(String name) {
		System.out.println(name + "ye");
	}
}

class yeni extends Polymorphism01 {
	//overriding ile polimorphism yaptik
		public void eat(String name) {
			System.out.println("Lütfen ye");
		}
	
}
