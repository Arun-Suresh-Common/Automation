public class Main
{
	public static void main(String[] args) {
		String a = "12345";
		String s[] = a.split("");
		int sum = 0;
		for(int i=0;i<s.length;i++){
		    int j = Integer.parseInt(s[i]);
		    sum = sum +j;
		}
		System.out.println(sum);
	}
}
