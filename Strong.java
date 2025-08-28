import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Strong {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long n,sum=0,fact=1,id;
        n=sc.nextInt();
        long copy=n;
        while(n>0){
            id=n%10;
            n=n/10;
            fact=1;
            for(int i=1;i<=id;i++){
                fact=fact*i;
            }
            sum=sum+fact;
        }
        if(copy==sum)
            System.out.println("Strong Number");
        else
            System.out.println("Not a strong number");
    }
}
