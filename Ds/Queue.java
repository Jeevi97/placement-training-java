import java.util.*;
class Queue
{
     int rear ,size ;
    int a[] ;  
    Queue(int n)
    {
       rear = -1;
        a = new int[n];
        size = n;
    }
    void enqueue(int n)
    {
        if(rear == size-1)
           System.out.println("queue full\n");
         else{
             a[++rear ] = n;
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
    
    void dequeue()
    {
        if(rear==-1)
         System.out.println("queue empty\n");
         else 
         {
             for(int i =0;i<rear ; i++)
             {
                  a[i] = a[i+1];
             }
             a[rear] = 0;
             rear--;
         }
         
    }
    
    public class Main
{
	public static void main(String[] args) {
	 Queue q = new Queue(10);
	 q.enqueue(10);
	 q.enqueue(20);
	 q.enqueue(30);
	 q.display();
	 q.dequeue();
	 q.display();
	 q.dequeue();
	 q.display();
	 q.dequeue();
	 q.display();
	 q.dequeue();
	 q.display();
	}
}
    
}
