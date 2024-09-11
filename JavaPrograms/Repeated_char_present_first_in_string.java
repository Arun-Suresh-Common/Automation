package programs;

import java.util.HashMap;

public class Repeated_char_present_first_in_string {
	public static void main(String[] args) {
	
	String str = "weeksforgeeks";
	HashMap<Character, Integer> freq
            = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
 
        // Traverse the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (freq.get(c) > 1) {
                System.out.println(c);
                break;
            }
        }
	}

}
