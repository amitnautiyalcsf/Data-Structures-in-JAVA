package LinkedList;

public class LinkedListLength {
public static void main(String[] args) {
	Node nodeA= new Node();
	nodeA.data=4;
	Node nodeB= new Node();
	nodeB.data=7;
	Node nodeC= new Node();
	nodeC.data=10;
	Node nodeD= new Node();
	nodeD.data=19;
	nodeA.next= nodeB;
	nodeB.next= nodeC;
	nodeC.next=nodeD;
	System.out.println("Length of a list is "+listLength(nodeA));
	System.out.println("Length of a list is "+listLength(nodeB));
	System.out.println("Length of a list is "+listLength(nodeC));
	System.out.println("Length of a list is "+listLength(nodeD));
	
	
	
}

public static int listLength(Node aNode)
{
	
	int length=0;
	Node current= aNode;
	while(current.next!=null)
	{
		
		length++;
		current=current.next;
	}
	return length;
	
	

}

}
