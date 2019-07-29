package LinkedList;
public class SinglyLinkedList
{
    static private Node first=null;

    public static boolean isEmpty()
{
    return (first==null);
}


    
public static void insertFirst(int data)
{
    
    Node newNode= new Node();
    newNode.data=data;
    newNode.next=first;
    first=newNode;
    
}



public static Node deleteFirst()
{
    Node temp= first;
    first=first.next;
    return temp;
    
    
}



public static void displayList()
{
    System.out.println("List (first -----> last)");
    
    Node current = first;
    while(current!=null)
    {
     current.displayNode();
     current=current.next;
        
    }
    System.out.println();
    
}



public static void insertLast(int data)

{

Node current=first;
while(current.next!=null)
{
    current=current.next; 
    
}

Node newNode = new Node();
newNode.data=data;
current.next=newNode;

}


public static void main(String args[])
{
insertFirst(100);
insertFirst(200);
insertFirst(50);
insertFirst(90);
insertFirst(40);
displayList();
insertLast(99999);
displayList();

}
}