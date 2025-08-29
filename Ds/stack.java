import java.util.*;
class Stack 
{
    int top ,size ;
    int a[] ;  
    Stack(int n)
    {
        top = -1;
        a = new int[n];
        size = n;
    }
    
    void push(int n)
    {
        if(top==size-1)
           System.out.print("stack full");
        else{
            a[++top] = n;
        }   
    }
    
    void display()
    {
        for(int i = 0;i<size ;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n--------------------------\n");
    }
    
    void pop()
    {
        if(top == -1)
           System.out.println("stack is empty");
        
        else{
            a[top] = 0;
            top--;
        }   
    }
    
    
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   
		Stack s = new Stack(10);
		while(true)
		{
		    System.out.println("pop push display");
		    int n = sc.nextInt();
		    if(n==1)
		     {
		         int num = sc.nextInt();
		         s.push(num);
		     }
		     else if(n==2)
		     {
		         
		         s.pop();
		     }
		    else if(n==3)
		     {
		        
		         s.display();
		     }
		     
		}
		
	}
}
