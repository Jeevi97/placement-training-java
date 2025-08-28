import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Armstrong{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int copy=n;
        int count=0,power,ld,cube,add=0;
        while(n>0){
            count++;
            n=n/10;
        }
        n=copy;
        while(n>0){
            ld=n%10;
            n=n/10;
            power=1;
            for(int i=1;i<=count;i++){
            power=power*ld;
            }
            add+=power;
        }
        if(copy==add){
            System.out.print("Armstrong number");
        }
        else{
            System.out.print("Not an Armstrong number");
        }
    }
}
