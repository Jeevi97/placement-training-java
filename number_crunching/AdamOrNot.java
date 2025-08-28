import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AdamOrNot{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int squaren=n*n;
        int rev=0,revsquare,ld,md,revn=0;
        while(n>0){
            ld=n%10;
            n=n/10;
            rev=rev*10+ld;
        }
        revsquare=rev*rev;
        while(squaren>0){
            md=squaren%10;
            squaren=squaren/10;
            revn=revn*10+md;
        }
        if(revn==revsquare){
            System.out.print("Adam Number");
        }
        else{
            System.out.print("Not a adam number");
        }
    }
}
