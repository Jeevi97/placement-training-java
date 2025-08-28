import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ProductofDigits.java{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int n,mul=1;
        while(s>0){
            n=s%10;
            s=s/10;
            mul=mul*n;
        }
        System.out.print(mul);
    }
}
