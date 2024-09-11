package programs;

public class First_And_last_char_remove {

	public static void main(String[] args) {
		
		String str = "arun";
		StringBuilder sb = new StringBuilder(str);
		 
        // Removing the last character
        // of a string
        sb.deleteCharAt(str.length() - 1);

        // Removing the first character
        // of a string
        sb.deleteCharAt(0);
			 
		System.out.println(sb);


	}

}
