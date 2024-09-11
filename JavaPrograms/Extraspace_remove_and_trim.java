package a1;



public class Extraspace_remove_and_trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "  a   b ass s  ";
		String str1 = ")&$ 82 sf   js";
		String str2 = " 34 3    88 48";
		str.replaceAll("\\s+"," ").trim();
	    System.out.println(str.replaceAll("\\s+"," ").trim());
	    System.out.println(str1.replaceAll("\\s+"," ").trim());
	    System.out.println(str2.replaceAll("\\s+"," ").trim());
	}

}
