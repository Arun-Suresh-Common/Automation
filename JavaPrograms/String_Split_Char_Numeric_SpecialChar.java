package programs;

public class String_Split_Char_Numeric_SpecialChar {
	public static void main(String[] args) {

        //Without using inbuilt function
        String str = "Java11000!@#456ABC";
        StringBuilder alphabets = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();

        for (int k = 0; k < str.length(); k++) {
            char ch = str.charAt(k);
            if (ch >= '0' && ch <= '9') {
                numbers.append(ch);
            } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                alphabets.append(ch);
            } else {
                specialChars.append(ch);
            }
        }

        System.out.println("Alphabets: " + alphabets.toString());
        System.out.println("Numbers: " + numbers.toString());
        System.out.println("Special Characters: " + specialChars.toString());

		
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
