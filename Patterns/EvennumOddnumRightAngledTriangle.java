import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EvennumOddnumRightAngledTriangle.java{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val;
        for(int rows=1;rows<=n;rows++){
            if(rows%2==0){
                val=2;
            }
            else{
                val=1;
            }
            for(int col=1;col<=rows;col++){
                System.out.print(val);
                val+=2;
            }
            System.out.println();
        }
    }
}
