package a1;

public class Palindrome {
	public static void main(String args[]) {
		String s = "racecar";
		boolean b = s.equals(new StringBuilder(s).reverse().toString());
		if (b == true) {

			System.out.println("Palindrome String is: " + s);
		}

		int i = 454;
		int j = Integer.parseInt(new StringBuilder(String.valueOf(i)).reverse().toString());
		if (j == i) {
			System.out.println("palindrome integer is: " + j);
		}
	}
}
