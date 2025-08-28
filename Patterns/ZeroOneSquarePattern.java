import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ZeroOneSquarePattern{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int rows=1;rows<=n;rows++){
            for(int col=1;col<=n;col++){
                if(rows%2==col%2){
                    System.out.print("1");
                }
                else{
                     System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
