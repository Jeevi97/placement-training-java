import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Lcm{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i=2;
        while(true){
        if(i%a==0 && i%b==0){
            System.out.print(i);
            break;
        }
            i++;
}
    }
}
