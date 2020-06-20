package day28overriding;

public class Mammal extends Animal {
	
	public boolean birth=true;
	public String name="kedi";
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Mammal mammal= new Mammal();

	}
	
	public void feed() {
	System.out.println("Yavrularini besler");
	
	}
	public Mammal() {
		System.out.println(this.birth); // icersinde bulundugunuz clastaki varable ve methotlara ulasmanizisaglar
		this.feed();
		
		System.out.println(this.ege); // extends  edilen clas dakilerede ulasilabilir.
		System.out.println(this.name);
		this.move();
		
		// parantezsiz  super  parentlardaki varable ve methotlara ulasmanizi saglar
		
		System.out.println(super.ege);
		System.out.println(super.name);
		super.move();
		
		// super i ne icin kullaniyoruy prantlardekilere ulasmak icin 
		//cunkü ayni isimde varsa this kendi clasindakileri bulacaktir
		//parent lerdekiler görmeyecektir
		
		
		
		
	}
}
