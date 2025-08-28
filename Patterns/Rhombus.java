import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Rhombus{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int rows=1;rows<=n;rows++){
            for(int space=1;space<=n-rows;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=n;star++){
                System.out.print("*");
            }
             System.out.println();
        }
    }
}
