package programs;

public class String_Split_Char_Numeric_SpecialChar {
	public static void main(String[] args) {

		String s = "ar5un^&^!@5ku#%*)";
		StringBuilder str1 = new StringBuilder(), str2 = new StringBuilder(), str3 = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {

			if (Character.isAlphabetic(s.charAt(i))) {

				str1.append(s.charAt(i));

			}

			else if (Character.isDigit(s.charAt(i))) {
				str2.append(s.charAt(i));

			}

			else {
				str3.append(s.charAt(i));
			}
		}
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
