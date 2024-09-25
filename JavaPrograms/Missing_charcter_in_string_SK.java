// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       //Missing character in the string
       String str="suresh";
       char ch[]=str.toCharArray();
       Set<Character> s=new HashSet<>();
       for(char c:ch)
       {
           s.add(c);
       }
       for(char c='a';c<='z';c++)
       {
           if(!s.contains(c))
           {
               System.out.println(c);
           }
       }
    }
}