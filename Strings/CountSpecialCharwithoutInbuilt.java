import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountSpecialCharwithoutInbuilt {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int u=0,l=0,n=0,sp=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
        if(ch>=65 && ch<=90){
            u++;
        }
            else if(ch>=97 && ch<=122){
                l++;
            }
            else if(ch>=48 && ch<=57){
                n++;
            }
            else{
                sp++;
            }
    }
    System.out.print(sp);
}
}
