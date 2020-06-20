package day38interviewhazirlik;

public class Testbyvalue {

	public static void main(String[] args) {
		// bir methoda vareble yollandiginda java onunn kopyasini olustuur ve methoda kopyayi yollar 
		// böylece yüzdn varable nin orjinel degeri methot calistiktan sonrada aynikalir.
      int x=12;
      System.out.println(increment(x));
      System.out.println(x);

	}

	public static int increment(int a) {
		return a=a+1;
	}
}
