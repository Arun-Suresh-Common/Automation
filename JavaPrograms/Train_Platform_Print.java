package programs;

public class Train_Platform_Print {
	public static void main(String[] args) {
		int arr[] = { 400, 200, 800 };
		int dep[] = { 500, 300, 900 };
		int n = arr.length;
		int plat_needed = 1, result = 1;
		// run a nested loop to find overlap
		for (int i = 0; i < n; i++) {
			// minimum platform

			for (int j = 0; j < n; j++) {
				if (i != j)
					// check for overlap
					if (arr[i] >= arr[j] && dep[j] >= arr[i])
						plat_needed++;
			}

			// update result
			result = Math.max(result, plat_needed);
		}

		System.out.println(plat_needed);

	}
}
