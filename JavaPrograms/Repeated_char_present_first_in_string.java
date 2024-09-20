package programs;

import java.util.HashMap;

public class Repeated_char_present_first_in_string {
	public static void main(String[] args) {
	   String str = "yourStringHere";
        for (char c : str.toCharArray()) if (str.indexOf(c) != str.lastIndexOf(c))
	{ System.out.println(c); break; }
	  
	}

}
