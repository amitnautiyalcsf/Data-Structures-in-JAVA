package LinkedList;

class NodeDoubly
{

	NodeDoubly next=null;
	NodeDoubly Previous=null;
	int data;

	public void dispalyNode()
	{
		
		System.out.println("{"+data+"}");
		
	}
	
}

public class DoublyLinkedList {
	
	  private static  NodeDoubly first=null;
	    private static NodeDoubly last=null;
	    
	    public static boolean isEmpty()
	    {
	        return first==null;
	        
	    }
	    
	    public static void insertFirst(int data)
	    {
	        NodeDoubly newNode= new NodeDoubly();
	        newNode.data=data;
	        if(isEmpty())
	        {
	            last=newNode; 
	            
	            
	        }
	        else
	        {
	            
	            
	            first.Previous=newNode;
	            
	        }
	        newNode.next=first; 
	        first=newNode;
	        
	    }
	    public static void insertLast(int data)
	    {
	    
	    NodeDoubly newNode= new NodeDoubly();
	    newNode.data=data;
	    if(isEmpty())
	    {
	        first=newNode;
	    }
	    else
	    {
	        last.next=newNode;
	        newNode.Previous=last;
	        last=newNode;
	        
	    }
	    }
	 
	    
	    public static int deleteFirst()
	    {
	        int  temp=first.data;
	        if(first.next==null)
	        {
	            last=null;
	            
	        }
	        else
	        {
	        first.next.Previous=null;
	        }
	        
	        first=first.next;
	        
	        return temp;
	    }
	    

	    
	    public static int deleteLast()
	    {
	        int temp= last.data;
	        if(first.next==null)
	        {
	            first=null;
	            
	        }
	        else{
	            
	            last.Previous.next=null;
	        }
	        last=last.Previous;
	        return temp;
	        
	    }
	    
	  
	    
	    public static void insertAfter(int key, int data)
	    {
	        NodeDoubly newNode = new NodeDoubly();
	        newNode.data=data;
	        
	        NodeDoubly current=first;
	        while(current.data!=key)
	        {
	            current=current.next;
	            if(current==null)
	            {
	                return;
	                
	            }
	            
	        }
	        
	        if(current==last)
	        {
	         current.next=newNode;
	         last=newNode;
	        }
	        else
	        {
	        newNode.next=current.next;
	        current.next.Previous=newNode;
	            
	        }
	        
	        newNode.Previous=current;
	        current.next=newNode;
	    }
	    
	
	    
	    public static NodeDoubly deleteKey(int key)
	    {
	        NodeDoubly current=first;
	        while(current.data!=key)
	        {
	            
	            current=current.next;
	            if(current==null)
	            {
	                return null;
	                
	            }
	        }
	        if(current==first)
	        {
	            
	            first=current.next;
	            
	        }
	        else
	        {
	        current.Previous.next=current.next;
	        }
	        if(current==last)
	        {
	            
	            last=current.Previous;
	            
	        }
	        else{
	            current.next.Previous=current.Previous;
	            
	        }
	        return current;
	        
	    }
	    
	    public static void displayBackward()
	    {   
	        System.out.println("List(Last---->first)");
	        NodeDoubly current=last;
	        while(current!=null)
	        {
	            current.dispalyNode();
	            current=current.Previous;
	            
	            
	            
	        }
	        System.out.println();
	        
	    }
	    

	public static void displayForward()
	{
	    System.out.println("List(first----->last)");
	    NodeDoubly current= first;
	    while(current!=null)
	    {
	        current.dispalyNode();
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
	insertAfter(999999,3434);
	insertAfter(50,1009);
	deleteFirst();
	deleteLast();
	deleteKey(999999);
	
	displayForward();
	displayBackward();

	}

}
