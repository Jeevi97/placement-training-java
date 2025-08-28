import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class numberofoccurrence{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long l,copy=n;
        int count=0;
        int m=sc.nextInt();
            for(int i=0;n>0;i++){
                l=n%10;
                n=n/10;
                if(m==l){
                    count++;
                }
            }
            System.out.print(count);
        }
}
