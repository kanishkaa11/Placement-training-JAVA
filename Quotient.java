import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        float a=(float)n1/n2;
        int b=n1%n2;
        System.out.printf("%d / %d = %.6f%n", n1,n2,a);
        System.out.print(n1+" % "+n2+" = "+b);
    }
}
