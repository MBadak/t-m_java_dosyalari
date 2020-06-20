package day26encapsulation;

public class Dog extends Mammal {

	// extends yaptik dikkat
	
	public boolean sadik= true;
	
	
	public static void main(String[] args) {
		
		Dog dog= new Dog();
		System.out.println("Animal classtan geldi : "+dog.age);
		System.out.println("Animal classtan geldi : "+dog.name);
		dog.eat();
		dog.move();
		System.out.println("Mammal classtan geldi : "+dog.dogum);
		dog.feed();
		System.out.println("Dog classtan geldi : "+dog.sadik);
		dog.bark();
		
		
	}

	public void bark() {
		System.out.println("kopekler havlar");
	}
}
