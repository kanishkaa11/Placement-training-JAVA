import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Adam {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(); 
        int revN = reverse(n);
        
        int square = n * n;
        int squarerev = revN * revN;
        int revSquareReversed = reverse(squarerev);
        
        if (square == revSquareReversed)
            System.out.println("Adam Number");
        else
            System.out.println("Not a adam number");
    }
        public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
}
