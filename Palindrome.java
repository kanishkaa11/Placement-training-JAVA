import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Palindrome {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long d,copy=n,rev=0;
        while(n>0){
            d=n%10;
            n=n/10;    
            rev=rev*10+d;
        }
        if(copy==rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
