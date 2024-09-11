package programs;

import java.util.*;

public class MIssing_Numbers_inArray {
	public static void main(String[] args) {

		Integer a[] = { 12, 12, 3, 4, 4, 23, 9, 0, 0 };

		Set<Integer> s1 = new HashSet<Integer>();
		Collections.addAll(s1, a);
		int n = s1.size();
		Integer ar[] = new Integer[n];
		ar = s1.toArray(ar);
		Arrays.sort(ar);
		int s = ar.length;
		int cnt = 0;
		for (int i = ar[0]; i < ar[s - 1]; i++) {
			if (ar[cnt] == i) {

				cnt++;
			} else {

				System.out.print(i + " ");
			}

		}

	}
}
