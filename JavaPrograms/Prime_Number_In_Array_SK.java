// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       //Prime number find in array
       int arr[]={1,6,8,9,13,17};
       boolean isprime=true;
       for(int a:arr)
       {
       for(int i=2;i<a/2;i++)
       {
           if(a%i==0)
           {
               isprime = false;
               break;
           }
           else
           {
               isprime=true;
           }
       }
       if(a>1 && isprime)
       {
       System.out.println("Prime"+a);
       }
       else
       {
           System.out.println("Not Prime"+a);
       }
       }
    }
}