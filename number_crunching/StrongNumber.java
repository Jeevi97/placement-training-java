import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StrongNumber{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int fact=1,sum=0,ld;
        int n=sc.nextInt();
        int copy=n;
        while(n>0){
            ld=n%10;
            n=n/10;
            fact=1;
            for(int i=1;i<=ld;i++){
                fact=fact*i;
            }
            sum=sum+fact;
        }
        if(copy==sum){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a strong number"); 
        }
    }
}
