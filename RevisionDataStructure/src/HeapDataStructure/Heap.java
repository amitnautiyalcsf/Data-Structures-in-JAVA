package HeapDataStructure;

class Node
{
	private int key;

	public Node(int key) {
		super();
		this.key = key;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}
	
	
}


public class Heap 
{
	private Node[] heapArray;
	private int maxSize;// Size of the array
	private int currentSize; // number of nodes in the array

	public Heap(int size)
	{
		
		this.maxSize=size;
		currentSize=0;
		heapArray= new Node[size]; // actually creating an array
	}
	
	public int getSize()
	{
		
		return currentSize;
		
	}
	
	public boolean isEmpty()
	{
		
		return (currentSize==0);
		
	}
	
	public boolean insert(int key) 
	{
		
		if(currentSize==maxSize)
		{
			
			return false; // this means the array is full
		}
		
		Node newNode= new Node(key);
		heapArray[currentSize]= newNode;
		trickleUp(currentSize);
		
		currentSize++;
		
		return true;
		
		
	}

	private void trickleUp(int idx) 
	{
		
		int parentIndex= (idx-1)/2; // to find the parent of the node that is inserted
		Node nodeToInsert=heapArray[idx];
		
		//loop as long as we haven't reached the root and the key of the nodeTOInsert's parent is less than new Node 
		
		while(idx>0 && heapArray[parentIndex].getKey()<nodeToInsert.getKey())
		{
			
			heapArray[idx]=heapArray[parentIndex]; // move parent down
			idx= parentIndex;
			parentIndex= (parentIndex-1)/2;// move up
			
			
		}
		heapArray[idx]= nodeToInsert;
	
		
	}
	
	public Node remove()
	{
		
		Node root=heapArray[0];
		currentSize--;
		heapArray[0]= heapArray[currentSize];
		
		trickleDown(0);
		
		return root;
		
		
	}
	private void trickleDown(int idx)
	{
		
		
		int largerChildIdx;
		Node top= heapArray[idx]; // save last node in the top variable
		
		// loop will run as long as idx is not on the bottom row(at least 1 child)
		
		while(idx<currentSize/2)
		{
			
		int leftChildIdx= 2*idx+1;	// left Child Idx Position
		int rightChildIdx= leftChildIdx+ 1; // right child Idx Position
		
		//figure out which child is larger
		if(rightChildIdx<currentSize && 
				heapArray[leftChildIdx].getKey()<heapArray[rightChildIdx].getKey())
		{
			largerChildIdx= rightChildIdx;
			
			
		}
		else
		{
			
			largerChildIdx=leftChildIdx;
		}
		
		if(top.getKey()>= heapArray[largerChildIdx].getKey())
		{
			//successfully made root the largest key
			break;
			
		}
		heapArray[idx]=heapArray[largerChildIdx];
		idx= largerChildIdx;
		}
		
		heapArray[idx]=top;
		
		
		
	}
	
	public void displayHeap()
	{
		System.out.println("Heap Array: ");
		for(int i=0;i<currentSize;i++)
		{
			if(heapArray[i]!=null)
			{
				
				System.out.print(heapArray[i].getKey() + " ");
				
			}
			System.out.println();
			int nBlanks= 32;
			int itemsPerRow=1;
			int column =0;
			int j=0; // current Items 
			String dots ="...........................";
			System.out.println(dots+dots);
			
			while(currentSize>0)
			{
				if(column==0)
				{
					
					for(int k=0; k<nBlanks ; k++)
					{
						System.out.print(" ");
						
					}
					
				}
				
				
			
			System.out.print(heapArray[j].getKey());
			j++;
			if(j==currentSize)
			{
				break;
			}
			
			column++;
			// end of row 
			if(column==itemsPerRow)
			{
				
				nBlanks=nBlanks/2; //half the blanks
				itemsPerRow=itemsPerRow * 2;
				column=0;
				System.out.println();
			}
			else
			{
				for(int k=0;k<nBlanks*2;k++)
				{
					System.out.print(" ");
				}
			}
			
		}
			System.out.println("\n"+dots+dots);
		}
		
		
	}
	public static void main(String[] args) {
		Heap newHeap = new Heap(10);
		newHeap.insert(10);
		newHeap.insert(12);
		newHeap.insert(42);
		newHeap.insert(35);
		newHeap.insert(16);
		newHeap.insert(88);
		newHeap.insert(42);
		newHeap.insert(7);
		newHeap.displayHeap();
		
		
	}
}
