package a1;

public class Reverse_Without_Affect_Specialchar {
	public static void main(String[] args) {
	     String str = "a,b$ct";
	        char[] arr = str.toCharArray();
	        int i = 0, j = arr.length - 1;
	        while (i < j) {
	            if (!Character.isLetter(arr[i])) i++;
	            else if (!Character.isLetter(arr[j])) j--;
	            else {
	                char temp = arr[i];
	                arr[i++] = arr[j];
	                arr[j--] = temp;
	            }
	        }
	        System.out.println(new String(arr));
	        
//		  String str = "a,b$c";
//		 char[] arr = str.toCharArray();
//		    for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
//		        while (i < j && !Character.isLetter(arr[i])) i++;
//		        while (i < j && !Character.isLetter(arr[j])) j--;
//		        char temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
//		    }
//		    System.out.println(new String(arr));
//	  
	}
}
