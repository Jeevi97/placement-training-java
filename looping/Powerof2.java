import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Powerof2{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=1,flag=0;
        while(n>=p){
            if(n==p){
                flag=1;
                break;
            }
            p=p*2;
        }
        if(flag==1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
