package programs;

public class Reverse_Each_Word_String_Not_Affect_the_Index {

	public static void main(String... args) {

		String s = "arun kumar";

		String str[] = s.split(" ");
		String revstring = "";
		for (int i = 0; i < str.length; i++) {
			String revword = "";
			String word = str[i];

			for (int j = word.length()-1; j >= 0; j--) {

				revword = revword + word.charAt(j);
			}
			revstring = revstring + revword + " ";
		}
		System.out.println(revstring);
	}
}
