import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HallowSquarewithDiagonal{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int size=2*n-1;
        for(int rows=1;rows<=size;rows++){
            for(int col=1;col<=size;col++){
                if(rows==1||rows==size||col==1||col==size||rows==col||rows+col==size+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
