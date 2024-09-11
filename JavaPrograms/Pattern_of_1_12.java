package programs;

public class Pattern_of_1_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		for (int i = 1; i < num; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);

			}

			System.out.println();

		}
		System.out.println("################################");
		int num1 = 5;
		for (int i = 1; i <= num; i++) {

			for (int j = i; j <= num; j++) {
				System.out.print(j);

			}

			System.out.println();

		}
	}

}
