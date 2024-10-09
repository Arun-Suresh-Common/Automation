package a1;

import java.util.Arrays;

public class LargestTime_HH_MM_SS {
	public static String largestTimeFromDigits(int[] arr) {
	Arrays.sort(arr);
    for (int i = 5; i >= 0; i--) {
        for (int j = 5; j >= 0; j--) {
            if (j == i) continue;
            for (int k = 5; k >= 0; k--) {
                if (k == i || k == j) continue;
                for (int l = 5; l >= 0; l--) {
                    if (l == i || l == j || l == k) continue;
                    for (int m = 5; m >= 0; m--) {
                        if (m == i || m == j || m == k || m == l) continue;
                        int n = 15 - i - j - k - l - m;
                        int hours = arr[i] * 10 + arr[j];
                        int minutes = arr[k] * 10 + arr[l];
                        int seconds = arr[m] * 10 + arr[n];
                        if (hours < 24 && minutes < 60 && seconds < 60) {
                            return String.format("%02d:%02d:%02d", hours, minutes, seconds);
                        }
                    }
                }
            }
        }
    }
    return "-1";
}
	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 9, 0, 2 };
        System.out.println(largestTimeFromDigits(arr)); 
	}
}
