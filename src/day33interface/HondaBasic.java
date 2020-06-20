package day33interface;

public class HondaBasic extends Araba implements IcAraba, DisAraba  {

	public static void main(String[] args) {
 HondaBasic BasicHonda= new HondaBasic();
  BasicHonda.diesel();
  BasicHonda.direksiyon();
  BasicHonda.kapi();
  BasicHonda.klima();
  BasicHonda.koltuk();;
  BasicHonda.move();
	}

	@Override
	public void move() {
		System.out.println("11 saniyede 100 km hiza ulasir");
	}

	@Override
	public void kapi() {
		System.out.println("Standart 5 kapi");
	}

	@Override
	public void direksiyon() {
		System.out.println("Hidrolik direksiyon");
	}

	@Override
	public void koltuk() {
		System.out.println("Kumas koltuk");
	}

	@Override
	public void klima() {
		System.out.println("Analog Klima");
	}
}
