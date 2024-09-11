package programs;
import java.util.*;
public class String_Duplicate_Remove_Unique_Count {
	public static void main(String... args) {
		
	Set<String> s1 = new HashSet<String>();	
	Set<String> s2 = new HashSet<String>();	
	String s3 ="arunkumar";
	String s[] = s3.split("");
	int wrt=1;
	for(int i=0;i<s.length;i++) {
		for(int j=i+1;j<s.length;j++) {
			if(s[i].equals(s[j])) {
				
				s1.add(s[i]);
				
//				s[j]="0";
//				wrt = wrt + 1;
				
			}
			else {
				s2.add(s[i]);
			}
			
		}
		
//		if(s[i]!="0")
//		System.out.println(s[i]+" = "+wrt);
//		wrt =1;
//		
	}
	System.out.println("Duplicated character = "+s1);
	System.out.println("Duplicated Removed = "+s2);
	s2.removeAll(s1);
	System.out.println("Unique Character = "+s2);
	}
}
