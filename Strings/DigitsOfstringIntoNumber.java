import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int u=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
        if(Character.isDigit(ch)){
            u++;
            System.out.print(ch);
        }
    }
        if(u==0){
                 System.out.print("0");
        }
}
}
