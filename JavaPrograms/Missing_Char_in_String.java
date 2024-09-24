package programs;

import java.util.HashSet;

public class Missing_Char_in_String {
	public static void main(String[] args) {

	
//Missing char in String Simple program


		String s = "em";
		String smi = "abcdefghijklmnopqrstuvwxyz".replaceAll("["+s+"]","");

		//Lower and upper
		//String s = "emAF";
		//String sm = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".replaceAll("["+s+"]","");
		
		System.out.println(smi);
		
		//************************************

		//Another way of program
		String st = "emAJY";
		
		String p,p1;
		List<Character> li = new ArrayList<>();
			List<Character> li2 = new ArrayList<>();
		for(int i=0;i<st.length();i++){
		    if(!Character.isUpperCase(st.charAt(i))){
                li.add(st.charAt(i));
		    }
		    
		  else {
		      li2.add(st.charAt(i));
		  }

		}
		
		p = li.toString();
		String sb = p.replaceAll("[,]","");

		String sm = "abcdefghijklmnopqrstuvwxyz".replaceAll("["+ sb +"]","");
		System.out.println("lower "+sm);
		

		p1 = li2.toString();
		String sb1 = p1.replaceAll("[,]","");

		String sm1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".replaceAll("["+ sb1 +"]","");
		System.out.println("upper "+sm1);

	 //************************************
		String str = "AZab";
		HashSet<Character> presentChars = new HashSet<>();

		// add each character to the set
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'a' && c <= 'z') {
				presentChars.add(c);
			} else if (c >= 'A' && c <= 'Z') {
				presentChars.add(Character.toUpperCase(c));
			}
		}

		// check which characters are missing
		StringBuilder missingChars = new StringBuilder();
		StringBuilder missingChars1 = new StringBuilder();
		for (char c = 'a'; c <= 'z'; c++) {
			if (!presentChars.contains(c)) {
				missingChars.append(c);
			}
		}

		for (char c = 'A'; c <= 'Z'; c++) {
			if (!presentChars.contains(c)) {
//                missingChars.append(c);
				missingChars1.append(c);
			}
		}

		// print the missing characters
		if (missingChars.length() == 0) {
			System.out.println("The string is a pangram.");
		} else {
			System.out.println(missingChars);
			System.out.println(missingChars1);

		}
	}
}
