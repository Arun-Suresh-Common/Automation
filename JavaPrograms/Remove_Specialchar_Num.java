package a1;

public class Remove_Specialchar_Num {

	public static void main(String[] args) {
		String str = "56This#string%contains^special*char5cters&.63";
		
		//Remove Special char only
		String str1 = str.replaceAll("[^a-zA-Z0-9]", " ");
		
		//Remove Special char & numbers only
		String str2 = str.replaceAll("[^a-zA-Z]", " ");
		
		System.out.println(str1);
		System.out.println(str2);
	}
}
