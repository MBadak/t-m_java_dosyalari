package day32abstraction;

public class KralDairesi extends Otel {
	public static void main(String[] args) {
		KralDairesi musteri3= new KralDairesi();
		musteri3.kahvalti();
		System.out.println("Wifi ücretiniz : "+musteri3.wifi(4));
		System.out.println("International Tv ücretiniz : "+musteri3.tv("international",10));
	}
	@Override
	public void kahvalti() {
		System.out.println("Kahvaltiniz terasta Kral Restaurant'dadir");
	}
	public int tv(String international, int saat) {
		if (international.equals("international")) {
			return saat*5;
		}else {
			return 0;
		}
	}
}
