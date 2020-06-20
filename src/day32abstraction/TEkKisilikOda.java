package day32abstraction;

public class TEkKisilikOda extends Otel{

	public static void main(String[] args) {
		TEkKisilikOda musteri1 =new TEkKisilikOda();
		musteri1.kahvalti();
		System.out.println("Tv ücreti : "+musteri1.tv(5));       // 5 saat istedi musteri
		System.out.println("Wifi ücreti : "+musteri1.wifi(1));
		
		
		
	}

	@Override
	public void kahvalti() {
		
		System.out.println("Kahvaltiniz sadvictir");
	}

   public int tv(int saat) {
	return saat *2;
}
}
