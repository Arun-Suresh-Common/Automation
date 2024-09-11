package programs;

public class Integer_Compare_and_match_sum {
	public static void main(String... args) {
	
		int num=8;
		Integer a[]= {12,3,4,5,6,8,9,2};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
			if(a[i] + a[j] == num) {
				
				System.out.println(a[i]+" + "+a[j]+" = "+num);
			}
			}
		}
	}

}
