class Node {
    int data;
    Node next , prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    }
public class Main
{
    
    Node start = null , end = null;
    
    void insert(int n)
    {
        Node newnode = new Node(n);
        if(start==null)
        {
            start = newnode;
            end = newnode;
        }
        else{
            end.next = newnode;
            newnode.prev = end ;
            end = newnode;
        }
    }
    
    void display()
    {
        Node i = start ;
        while(i!=null)
        {
            System.out.print(i.data + " <-> ");
            i = i.next;
        }
        System.out.println("\n------------------------------------\n");
    }
     void reverse()
    {
        Node i = end ;
        while(i!=null)
        {
            System.out.print(i.data + " <-> ");
            i = i.prev;
        }
        System.out.println("\n------------------------------------\n");
    }
    
	public static void main(String[] args) 
	{
	    Main m = new Main();
	     m.insert(10);
	     m.insert(20);
	     m.insert(30);
	     m.insert(40);
	     m.display();
	     m.reverse();
	}
}
