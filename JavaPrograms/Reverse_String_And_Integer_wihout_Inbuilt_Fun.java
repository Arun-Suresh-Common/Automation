package programs;

public class Reverse_String_And_Integer_wihout_Inbuilt_Fun {

	public static void main(String... args) {

		String s = "arun";

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

		System.out.println();

		// Integer reverse
		Integer s1[] = { 2, 3, 4, 4549 };

		for (int i = s1.length - 1; i >= 0; i--) {
			System.out.print(s1[i]);
		}

		
		System.out.println();
		
		// Integer reverse using string
		String s2 = "985029";

		for (int i = s2.length() - 1; i >= 0; i--) {
			System.out.print(s2.charAt(i));
		}
		
		
		System.out.println();
		
		// Integer to string conversion
		
		int num=54321;
		String str = Integer.toString(num);
		
		
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		

	}
}
