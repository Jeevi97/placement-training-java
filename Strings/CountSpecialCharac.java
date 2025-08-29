import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountSpecialCharac {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int sp=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!Character.isLetterOrDigit(ch))
                sp++;
    }
        System.out.print(sp);
}
}
