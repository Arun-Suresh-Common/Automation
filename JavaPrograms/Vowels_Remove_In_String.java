package programs;

public class Vowels_Remove_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "arun";
		 str = str.replaceAll("[AEIOUaeiou]", "");
		 System.out.println(str);
	}

}
