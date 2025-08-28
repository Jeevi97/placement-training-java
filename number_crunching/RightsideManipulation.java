import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RightsideManipulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long ld;
        while(n>0){
            ld=n%10;
            n=n/10;
            System.out.print(ld+" ");
        }
    }
}
