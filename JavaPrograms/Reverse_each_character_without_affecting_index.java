// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       //Reverse String each charter
       String str = "Suresh Kasi";
       int start=0,end=str.length()-1;
       char ch[]=str.toCharArray();
       while(start<end)
       {
           if(ch[start]==' ')
           {
               start++;
           }
           else if(ch[end]==' ')
           {
               end--;
           }
           else
           {
               char temp=ch[start];
               ch[start]=ch[end];
               ch[end]=temp;
               start++;
               end--;
           }
       }
       System.out.println(ch);
    }
}