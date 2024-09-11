package programs;

public class String_first_letter_Upper_case_word_print {
	public static void main(String[] args) {

		String s1 = "arun aA ARUN Kumar eb";
		String s[] = s1.split(" ");
		for (String s3 : s) {

			char ch[] = s3.toCharArray();
			if (Character.isUpperCase(ch[0])) {

				System.out.println(s3);
			}
		}

	}
}
