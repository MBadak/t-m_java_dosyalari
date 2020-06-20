package day33interface;

public class HondaLux extends Araba implements IcAraba ,DisAraba  {

	public static void main(String[] args) {
HondaLux luxHonda =new HondaLux();
luxHonda.benzin();
luxHonda.direksiyon();
luxHonda.kapi();
luxHonda.klima();
luxHonda.koltuk();
luxHonda.move();


	}
	@Override
	public void move() {
		System.out.println("3 saniyede 100 km Hiza ulasir");
	}

	@Override
	public void kapi() {
		System.out.println("Parmak izli kapi");
	}

	@Override
	public void direksiyon() {
		System.out.println("Gercek deri direksiyon");
	}

	@Override
	public void koltuk() {
	System.out.println("Isitmali deri koltuk");
	}

	@Override
	public void klima() {
	System.out.println("dijital Klimali");
	}
}
