package programs;

public class Sorting_Without_Inbuild_Fun_Second_highest_Integer {
	public static void main(String... args) {

		Integer a[] = { 26, 12, 2, 4, 77, 3, 4, 5, 1 };
		


		int temp, size = a.length;
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				// Descending order use '<'
				if (a[i] < a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}

		System.out.println("Secong lowest = " + a[size - 2]);

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}

	}

}
