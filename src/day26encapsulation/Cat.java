package day26encapsulation;

public class Cat extends Mammal {

	public boolean clean = true;

	public static void main(String[] args) {
	
		Cat cat=new Cat();
		System.out.println("Animal classtan geldi : "+(cat.age+1)+ " yasinda");
		System.out.println("Animal classtan geldi : "+cat.name );
		cat.eat();
		cat.move();
		System.out.println("Mammal classtan geldi : "+cat.dogum);
		cat.feed();
		System.out.println("Cat classtan geldi : "+cat.clean);
		cat.meow();
		
	}

	public void meow() {
		System.out.println("kediler miyavlar");
	}
}
