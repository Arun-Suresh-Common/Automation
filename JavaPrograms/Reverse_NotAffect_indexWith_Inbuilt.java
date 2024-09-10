package a1;

import org.testng.annotations.Test;

public class Reverse_NotAffect_indexWith_Inbuilt {

	public static void main(String[] args) {

		String str = "arun kumar";
		String s[] = str.split(" ");

		for (int i = 0; i < s.length; i++) {

			StringBuilder s1 = new StringBuilder(s[i]);
			System.out.print(s1.reverse() + " ");
		}
	}

}
