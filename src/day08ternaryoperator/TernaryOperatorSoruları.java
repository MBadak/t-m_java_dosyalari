package day08ternaryoperator;

public class TernaryOperatorSoruları {

	public static void main(String[] args) {
		
		// ekran görüntülerini tahmin edelim
		
		int y =10;
		System.out.println(y>5 ? 2*y :3*y); // tahminim 20 d
		
		int x=7;
		System.out.println(x<5 ? 2*x :3* x ); // tahminim 21 d
		
		int a=112;
		System.out.println(a>5  ? "inek"  :"koyun"); // tahminim  inek d
		System.out.println(a<91 ?   9  :  11 );      // tahminim 11 d
	
		int q=1;
		int z=1;
		int s= q<10 ? q++ :z++;
		System.out.println(q + "," + z +s); // 2,11  d
		
	//	int w=12;
	//	System.out.println(w>5 ? w<10 ? 2*w :3*w :w>10 ?2+w :3+w); // 3*12 = 36 d
		
	//	int w=8;
	//	System.out.println(w>5 ? w<10 ? 2*w :3*w :w>10 ?2+w :3+w); // 16 d
		
		int w=5;
		System.out.println(w>5 ? w<10 ? 2*w :3*w :w>10 ?2+w :3+w); // 3 +5= 8  d
		
	}

}
