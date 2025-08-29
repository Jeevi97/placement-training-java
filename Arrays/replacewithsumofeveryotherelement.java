import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class replacewithsumofeveryotherelement {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,result;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        for(int i=0;i<n;i++){
            result=sum-a[i];
            System.out.print(result+" ");
        }
    }
}
