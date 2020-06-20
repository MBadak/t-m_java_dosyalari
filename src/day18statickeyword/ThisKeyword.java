package day18statickeyword;

public class ThisKeyword {
	int x = 12;
	static int y = 13;

	ThisKeyword(int x) {
		// this demek bu class�n i�ersindeki demek
		// instance ve static lere bakar

		this(); // <== bu class i�ersindeki parametresiz constructoru �a��r�r.
				// bir constructor �a��racksak ilk sat�ra yazmal�y�z . aksi takdirde compile
				// time eror verir.
		this.x = x;
		System.out.println("parametreli contsructor");
	}

	ThisKeyword() {
		System.out.println("parantezsiz contructor");
	}

	public static void main(String[] args) {
//		ThisKeyword obj =new ThisKeyword(0);
//		System.out.println(obj.x);

		ThisKeyword obj1 = new ThisKeyword(85);

		System.out.println(obj1.x);

	}

}
