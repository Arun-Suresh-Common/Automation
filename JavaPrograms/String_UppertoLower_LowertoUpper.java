package programs;

public class String_UppertoLower_LowertoUpper {
	public static void main(String... args) {
		
		String s = "ArUnKuMar";
		StringBuilder str1 = new StringBuilder(s); 
		for(int i=0;i<s.length();i++) {
			
			if(Character.isLowerCase(s.charAt(i))) {
					
				str1.setCharAt(i,Character.toUpperCase(s.charAt(i)));
		
			}
			
			else if(Character.isUpperCase(s.charAt(i)))
			{	
				str1.setCharAt(i,Character.toLowerCase(s.charAt(i)));
	
			}	
		
		}
		
		System.out.println("Lower to Upper and Up to low: "+str1);
		
	//Full string changing lower and lower	
		String s6 = "ArUnKuMar";
		StringBuilder str4 = new StringBuilder(s6), str5 = new StringBuilder(s6); 
		for(int i=0;i<s6.length();i++) {
			
			if(Character.isLowerCase(s6.charAt(i))) {
					
				str4.setCharAt(i,Character.toUpperCase(s6.charAt(i)));
		
			}
			
			else if(Character.isUpperCase(s6.charAt(i)))
			{	
				str5.setCharAt(i,Character.toLowerCase(s6.charAt(i)));
	
			}	
		
		}
		
		System.out.println("Upper case updated: "+str4);
		System.out.println("Lower case updated: "+str5);
		
		
		
	}

}
