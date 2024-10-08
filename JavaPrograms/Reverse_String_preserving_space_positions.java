package programs;

public class Reverse_String_preserving_space_positions {
	public static void main(String[] args) {
	String a = "arun em f tew";

	char ch[] = a.toCharArray();
	int i=0,j=ch.length-1;
	while(i<j){
	    if(ch[i]==' '){i++;continue;}
	
	   else if(ch[j]==' '){j--;continue;}
	
	else{
	    char temp = ch[i];
	    ch[i++] = ch[j];
	    ch[j--] = temp;
	   // i++;
	   // j--;
	}
	}
	System.out.println(new String(ch));
	}
}
