package programs;
import java.util.*;
public class HashMap_Iteration_comparing_getkey_and_value {
	public static void main(String[] args) {
		
	Map<String,String> map = new HashMap<String,String>();
	map.put("arun","sec1");
	map.put("a","sec1");
	map.put("b","sec2");
	
	for(Map.Entry m :map.entrySet()) {
		
		
//		System.out.println(m.getKey()+" "+m.getValue());
		
		if(m.getValue()=="sec1") {

			System.out.println(m.getKey()+" "+m.getValue());	
		}
	}
	}
}
