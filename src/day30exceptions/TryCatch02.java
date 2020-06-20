package day30exceptions;

public class TryCatch02 {

	public static void main(String[] args) {
		String s= "";
		
		try {
			s+="t";
		}catch (Exception e) {
			
			s+="c";
						
		}finally {
			s+="f";
		}
		s+="a";
System.out.println(s);
//String'e null atandigi zaman veya instance variable'a 
//deger atamasi yapilmadiginda length() methodu calismaz
//ve NullPointerException exception alirsiniz.
String n = null;
//Asagidaki iki satirdaki kod da exception verir
//System.out.println(n.length());
//System.out.println(m.length());       
}
}
