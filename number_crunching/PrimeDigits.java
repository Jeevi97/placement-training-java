import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrimeDigits{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            char b=str.charAt(i);
            if(b=='2' || b=='3' || b=='5' || b=='7')
                System.out.print(b+" ");
            }
        }
}
