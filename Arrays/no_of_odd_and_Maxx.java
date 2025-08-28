import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,sum=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            count++;
        if(a[i]%2==0){
            sum++;
        }
        }
        int result=count-sum;
        System.out.println("Odd = "+result);
        System.out.println("Even = "+sum);
    }
}
