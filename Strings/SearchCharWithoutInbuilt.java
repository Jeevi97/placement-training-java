import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        sc.nextLine();
        String word=sc.nextLine();
        int u=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch==a){
        /*if(word.contains(String.valueOf(a))){*/
             u++;
        }
    }
        if(u>=1){
            System.out.print("Present");
        }
        else{
             System.out.print("Not Present");
        }
}
}
