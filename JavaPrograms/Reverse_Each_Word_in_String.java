package programs;

public class Reverse_Each_Word_in_String {
	
	public static void main(String... args) {
		
	String str = "arun kumar new";
	String s[] = str.split(" ");
	for(int i=s.length-1;i>=0;i--) {
		System.out.println(s[i]);
	}
	}

}
