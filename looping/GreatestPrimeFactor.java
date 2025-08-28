import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GreatestPrimeFactor{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
       for (int i = 3; i <= n; i += 2) {
            while (n % i == 0) {
                max = i;
                n = n / i;
            }
        }
        System.out.print(max);

}
}
