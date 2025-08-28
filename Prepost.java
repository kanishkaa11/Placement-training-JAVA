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
        int pre=++n1;
        int post=n2++;
        System.out.println("Pre increment:"+ pre);
        System.out.println("Post increment:"+ post);
        System.out.println("Final values:"+ pre+" "+ (post+1));
    }
}
