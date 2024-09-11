package programs;

import java.util.*;

public class HashMap_Char_Count_occurence {

	public static void main(String... args) {
		String s = "Sakkettt";

		char[] ch = s.toCharArray();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		int count = 0;
		for (char c : ch) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, count + 1);
			}
		}

		for (Map.Entry<Character, Integer> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		System.out.println(" ************************** ");
	//word repeated occurence
		
		String s2 = "bc a Sak ket tt a bc";
		String s3[] = s2.split(" ");

//		char[] ch = s.toCharArray(" ");

		HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
		int count1 = 0;
		for (String c1 : s3) {
			if (hm2.containsKey(c1)) {
				hm2.put(c1, hm2.get(c1) + 1);
			} else {
				hm2.put(c1, count1 + 1);
			}
		}

		for (Map.Entry<String, Integer> m1 : hm2.entrySet()) {
			System.out.println(m1.getKey() + " " + m1.getValue());
		}
	}
}
