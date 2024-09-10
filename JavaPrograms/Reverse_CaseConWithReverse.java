package a1;

public class Reverse_CaseConWithReverse {

	public static void main(String[] args) {
		String str = "Arun Kumar";
		StringBuilder str1 = new StringBuilder(str);
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				str1.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}

			else if (Character.isUpperCase(str.charAt(i))) {
				str1.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}

		for (int j = str1.length() - 1; j >= 0; j--) {
			System.out.print(str1.charAt(j));
		}
	}

}
