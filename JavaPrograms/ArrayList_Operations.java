package programs;

import java.util.ArrayList;

public class ArrayList_Operations {

	public static void main(String[] args) {
		
		//Compare two list object and get values
		ArrayList<String> li = new ArrayList<String>();

		li.add("a");
		li.add("Geeks");
		li.add("c");
		
		li.add("a");

//		System.out.println("List1: " + li);
		ArrayList<String> li1 = new ArrayList<String>();
		li1.add("Hii");
	
		li1.add("a");
		li1.add("Gaurav");

//		System.out.println("List2: " + li1);
		li.retainAll(li1);
		System.out.println(li);
		li1.removeAll(li);


		System.out.println(li);
		System.out.println("li1"+li1);

	}
}
