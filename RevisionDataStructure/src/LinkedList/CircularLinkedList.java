package LinkedList;
public class CircularLinkedList {
	    private static  Node first=null;
	    private static Node last=null;

	public static void insertFirst(int data)
	{
	    Node newNode= new Node();
	    newNode.data=data;
	    if(isEmpty())
	    {
	        last=newNode;
	        
	    }
	    
	    newNode.next=first;
	    first=newNode;
	}

	public static boolean isEmpty()
	{
	    return first==null;
	    
	}


	public static void insertLast(int data)

	{
	    
	    Node newNode= new Node();
	    newNode.data=data;
	    if(isEmpty())
	    {
	        
	        first=newNode;
	        
	    }
	    else{
	    
	    last.next=newNode;
	    last=newNode;
	    
	    }
	}
	public static int deleteFirst()
	{
	    int temp=first.data;
	    if(first.next==null)
	    {
	        last=null;
	        
	    }
	    first=first.next;
	    return temp;
	    
	    
	    
	}
	public static void displayList()
	{
	    Node current=first;
	    System.out.println("List (first----->last)");
	    while(current!=null)
	    {
	        current.displayNode();
	        current=current.next;
	        
	    }
	    System.out.println();
	    
	}

	public static void main(String args[])
	{


	insertFirst(100);
	insertFirst(200);
	insertFirst(50);
	insertFirst(90);
	insertFirst(40);
	insertLast(999999);

	displayList();
	System.out.println(deleteFirst());
	displayList();

	}
}
	
