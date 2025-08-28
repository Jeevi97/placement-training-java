import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrePostIncrement{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Pre increment:"+ ++n);
        System.out.println("Post increment:"+ b++);
        System.out.println("Final values:"+n+" " + b);
    }
}
