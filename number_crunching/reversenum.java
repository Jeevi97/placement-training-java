import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class reversenum{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long ld,rev=0;
        while(n>0){
            ld=n%10;
            n=n/10;
            rev=rev*10+ld;
        }
        System.out.print(rev);
    }
}
