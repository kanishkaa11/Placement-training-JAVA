import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Num {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.print(count);
    }
}
