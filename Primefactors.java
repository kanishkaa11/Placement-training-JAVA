import java.io.*;
import java.util.*;
public class Primefactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        while(n>1){
            int count=0;
            while(n%i==0){
                count++;
                n=n/i;
            }
                if(count>0){
                    System.out.println(i+"->"+count);
                }
                    i++;        
            }
    }
}
