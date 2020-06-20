package day27constructorcagirma;

public class Mammal extends Animal {

	public boolean dogum = true;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Mammal mammal=new Mammal();
		Mammal mammal1=new Mammal(15);

	}

	public void feed() {
		System.out.println("Cocuklarini besler");
	}
	
	Mammal() {
		this(11); // parent'daki parametresiz contructor u  cagirir
				 // super()  kullanmasanizda olur ama bazilari kullanir sasirmayiniz
				 // super(( ilk satirda olamidir
				 // this()  ile super() ayni contructor da olamaz ikiside ilk satirda olmak zorundadir
		
		System.out.println("Mammal parametresiz contrusctor");
	}
	
	public Mammal(int age) {
		super ();
		System.out.println("Mammal parametreli contrusctor");
	}
	
}