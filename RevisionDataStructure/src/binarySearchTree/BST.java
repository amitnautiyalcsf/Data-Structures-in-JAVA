package binarySearchTree;


class Node
{
	
	int key;
	String value;
	Node leftChild, rightChild;
	
	public Node( int key,String value)
	{
		this.key=key;
		this.value=value;
		
	}
	
	
}
public class BST {
	
	 private Node root;
	    public void insert(int key, String value)
	    {
	        Node newNode= new Node(key,value);
	        if(root==null)
	        {
	            root= newNode;
	            
	            
	        }
	        else{
	            Node current=root;
	            Node parent;
	            while(true)
	            {
	                parent= current;
	                if(key<current.key)
	                {
	                    current=current.leftChild;
	                    if(current==null)// it's parent is the leaf Node
	                    {
	                        parent.leftChild=newNode;
	                        return;
	                        
	                    }
	                    
	                }
	                else{
	                    current=current.rightChild;
	                    if(current==null)
	                    {
	                        
	                        parent.rightChild=newNode;
	                        return;
	                    }
	                    
	                    
	                }
	                
	                
	            }
	            
	        }
	        
	        
	    }
	    
	    
	    public Node findMin()
	    {
	        Node current=root;
	        Node last=null;
	        while(current!=null)
	        {
	            last=current;
	            current=current.leftChild;
	            
	            
	        }
	        return last;
	        
	        
	    }
	    
	    public Node findMax()
	    {
	        Node current=root;
	        Node last=null;
	        while(current!=null)
	        {
	            last=current;
	            current=current.rightChild;
	            
	            
	        }
	        return last;
	        
	        
	        
	    }
	    
	    public boolean deleteNode(int key)
	    {
	        Node currentNode=root;
	        Node parentNode=root;
	        
	        boolean isLeftChild=false;
	        
	        //Searching to find the node with the key to delete
	        while(currentNode.key!=key)
	        {
	            parentNode=currentNode;
	            if(key<currentNode.key)
	            {
	                isLeftChild=true;
	                currentNode=currentNode.leftChild;
	            }
	            else {
	                currentNode= currentNode.rightChild;
	                isLeftChild=false;
	                
	            }
	            if(currentNode==null)
	            {
	                return false;
	                
	            }
	            
	        }
	        //At this point we found the Node
	        
	        Node nodetoDelete=currentNode;
	        
	        // if node is a leaf
	        if(nodetoDelete.leftChild==null && nodetoDelete.rightChild==null)
	        {
	            //
	            if(nodetoDelete==root)
	            {
	                root=null;
	            }
	            
	            else if(isLeftChild)
	            {
	                parentNode.leftChild=null;
	            }
	            else
	            {
	                
	                parentNode.rightChild=null;
	                
	            }
	        }
	        // if node has one Child that is on the left
	        
	        else if(nodetoDelete.rightChild==null)
	        {
	            
	            if(nodetoDelete==root)
	            {
	                
	                root=nodetoDelete.leftChild;
	            }
	            else if(isLeftChild)
	            {
	                parentNode.leftChild=nodetoDelete.leftChild;
	                
	            }
	            else{
	                
	                parentNode.rightChild= nodetoDelete.leftChild;
	            }
	        }
	        
	        
	        // if node has one Child that is on the right
	        else if(nodetoDelete.leftChild==null)
	        {
	            
	            if(nodetoDelete==root)
	            {
	                
	                root=nodetoDelete.rightChild;
	            }
	            else if(isLeftChild)
	            {
	                parentNode.leftChild=nodetoDelete.rightChild;
	                
	            }
	            else{
	                
	                parentNode.rightChild= nodetoDelete.rightChild;
	            }
	        }
	    // if node has two children(tricky)
	        
	    else
	    {
	        
	        Node successor=getSuccessor(nodetoDelete);
	        // here we find the minimum value and now we coonect parent of nodetoDelete tosuccessor instead
	        if(nodetoDelete==root)
	        {
	            root=successor;
	            
	        }
	        else if(isLeftChild)
	        {
	            
	            parentNode.leftChild=successor;
	            
	        }
	        else{
	            
	        parentNode.rightChild=successor;
	            
	        }
	        
	        successor.leftChild=nodetoDelete.leftChild;
	        
	        }
	        
	        
	        return true;
	        
	        
	    }
	    private Node getSuccessor(Node nodetoDelete)
	    {
	        Node successorParent= nodetoDelete;
	        Node successor=nodetoDelete;
	        
	        Node current=nodetoDelete.rightChild;//go to the right Child
	        while(current!=null)// start going left down the tree untill node has no left child
	        {
	            successorParent=successor;
	            successor=current;
	            current=current.leftChild;
	            
	        }
	        // if the successor is not a right child 
	        if(successor!=nodetoDelete.rightChild)
	        {
	            successorParent.leftChild=successor.rightChild;
	            successor.rightChild=nodetoDelete.rightChild;
	            
	        }
	        return successor;
	            
	        }
	        
	        
	    
	public static void main(String[] args) {
		BST bst= new BST();
		bst.insert(10, "Ten");
		bst.insert(20, "Twenty");
		bst.insert(30, "Thirty");
		bst.insert(40, "fourty");
		bst.insert(50, "fifty");
		bst.insert(60, "sixty");
		
		System.out.println(bst.findMin().key);
		System.out.println(bst.findMax().key);
	}

}
