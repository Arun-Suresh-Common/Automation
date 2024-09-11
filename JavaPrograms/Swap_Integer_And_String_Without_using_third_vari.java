package programs;

public class Swap_Integer_And_String_Without_using_third_vari {
	public static void main(String... args) {
	
		int a = 10, b =20;
		a = a + b;
		b = a- b;
		a = a - b;
		
	System.out.println("a = " + a + " b = "+b);
	
	//Swap String
	String a1 = "arun", b1 = "kumar";
	a1  = a1 + b1;
	b1 = a1.substring(0,a1.length()-b1.length());
	a1 = a1.substring(b1.length());
	
	System.out.println("a1= "+a1+ " b1= "+b1);
	
	
	}

}
