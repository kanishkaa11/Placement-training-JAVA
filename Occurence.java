import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Occurence {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int key=sc.nextInt();
        int id,count=0;
        while(n>0){
            id=n%10;
            n=n/10;
            if(id==key){
                count++;
            }
        }
        System.out.print(count);
    }
}
