import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Armstrong {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long n,sum=0,power =1,count=0,ld;
        n = sc.nextInt();  
        long copy=n;
        while(n>0){
            count++;
            n=n/10;
        }
        n=copy;

        while(n>0)
        {
            ld = n% 10;
            n = n /10;
            power = 1;
            for(int i=1 ; i<=count ; i++)
            {
                power = power * ld;
         
            }
            sum = sum + power;
        }
        if(copy == sum)
        System.out.println("Armstrong number");
        else 
        System.out.println("Not an Armstrong number");
    }
}
