import java.io.*;
import java.util.*;
public class Minmaxsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min=n;
        int max=n;
        int sum=0,count=0;
        while(n!=-1){
            if(n<min) 
                min=n;
            if(n>max) 
                max=n;
            sum+=n;
            count++;
            n=sc.nextInt();
        }
        float avg=(float) sum/count;
        System.out.println("Min = "+min);
        System.out.println("Max = "+max);
        System.out.println("Sum = "+sum);
        System.out.printf("Average = %.6f\n",avg);
        
    }
}
