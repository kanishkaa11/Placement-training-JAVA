import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Product {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int id,prod=1;
        while(n>0){
            id=n%10;
            n=n/10;
            prod=id*prod;
        }
        System.out.print(prod);
    }
}
