package stackDS;

public class Stack {

	private int maxSize;
	private long stackArray[];
	private  int top;
	public Stack(int size)
	{
		this.maxSize=size;
		this.top=-1;
		this.stackArray= new long[maxSize];
	}
	
	
	public void push(long data)
	{
		
		if(isFull())
		{
			System.out.println("Stack is full Ammy no space is available");
			
		}
		top=top+1;
		
		stackArray[top]=data;
		
		
	}
	
	
	public long pop()
	{
		
		if(isEmpty())
		{
			System.out.println("No item is dere as this stack is Empty Ammy");
			
		}
		long temp= stackArray[top];
		top--;
		return temp;
		
	}
	
	public boolean isEmpty()
	{
		
		return top==-1;
		
	}
	
	public  boolean isFull()
	{
		return (maxSize-1==top);
	}
	
	 public long peek()
	    {
	        
	        return stackArray[top];
	        
	    }
	
	
	
	
	  public static void main(String[] args) {
			Stack st= new Stack(10);
			
				st.push(10);
				st.push(20);
				st.push(90);
				st.push(100);
			    System.out.println(st.peek());
				while(!st.isEmpty())
				{
				    
				    System.out.println(st.pop());
				}
				

				
	
	}

}
