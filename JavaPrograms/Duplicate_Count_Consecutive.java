package programs;

public class Duplicate_Count_Consecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "WWEAERRWE";
		char[] ch = str.toCharArray();
		for(int i =0;i<ch.length;i++){
			int count = 1;
			while(i+1<ch.length && ch[i] == ch[i+1]){
				i++;
				count++;
			}
			System.out.println(ch[i]+" : "+count);
		}

	}

}
