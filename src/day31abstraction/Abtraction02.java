package day31abstraction;

public class Abtraction02  extends  Abtraction01{

	public static void main(String[] args) {
		Abtraction02 obj = new Abtraction02 ();
		obj.abstractMethod();
		obj.concreteMethode();
	}

	@Override
	public void abstractMethod() {
	System.out.println("Abstract methodun Override edilmis hali");
		
	}
	
	

}
