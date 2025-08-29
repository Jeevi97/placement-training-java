import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountUppercase{

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int u=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>=65 && c<=90){
                u++;
            }
        }
        System.out.print(u);
    }
}
