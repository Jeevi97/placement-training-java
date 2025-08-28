class LL{
class Student{
    String name;
    String dept;
    int phno;
    Student next;
    public Student(String name,String dept,int phno){
        this.name=name;
        this.dept=dept;
        this.phno=phno;
    }
}
Student start=null,end=null;
void insert(String n,String d,int no){
    Student newnode=new Student(n,d,no);
    if(start==null){
        start=newnode;
        end=newnode;
    }
    else{
        end.next=newnode;
        end=newnode;
    }
}
void display(){
    Student i;
    for(i=start;i!=null;i=i.next){
        System.out.println("name: "+i.name);
        System.out.println("dept: "+i.dept);
        System.out.println("phno: "+i.phno);
        System.out.println("--------------------");
    }
    System.out.println();
}
public static void main(String args[]){
    Main m=new Main();
    m.insert("jeevi","CSE",964612234);
    m.insert("kani","CSBS",937456172);
    m.insert("abi","IT",934569941);
    m.display();
}
}
