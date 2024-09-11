package programs;

import java.util.HashSet;

public class MIssing_Char_in_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AZab";
        HashSet<Character> presentChars = new HashSet<>();
 
        // add each character to the set
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z'){
                presentChars.add(c);
            }
            else if (c >= 'A' && c <= 'Z'){
                presentChars.add(Character.toUpperCase(c));
            }
        }
 
        // check which characters are missing
        StringBuilder missingChars = new StringBuilder();
        StringBuilder missingChars1 = new StringBuilder();
        for(char c = 'a'; c <= 'z'; c++){
            if(!presentChars.contains(c)){
                missingChars.append(c);
            }
            
            
        }
        
        for(char c = 'A'; c <= 'Z'; c++){
            if(!presentChars.contains(c)){
//                missingChars.append(c);
                missingChars1.append(c);
            }
            
            
        }
 
        // print the missing characters
        if(missingChars.length() == 0){
            System.out.println("The string is a pangram.");
        }
        else{
            System.out.println(missingChars);
            System.out.println(missingChars1);

        }
	}

}
