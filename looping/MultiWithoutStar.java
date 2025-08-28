import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MultiWithoutStar{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=1;i<=a;i++){
            sum+=b;
        }
        System.out.print(sum);
    }
}
