package stackDS;

public class ReverseAStringUsingStack {

	private int maxSize;
	private int top;
	private char[] stackArray;
	public ReverseAStringUsingStack(int maxSize) 
	{
		super();
		this.maxSize = maxSize;
		this.top = -1;
		this.stackArray = new char[maxSize];
	}
	
	public void push(char data)
	{
		
		if(isFull())
		{
			
			System.out.println("our stack is full");
			
		}
		top++;
		stackArray[top]=data;
		
	}
	
	public char pop()
	{
		
		if(isEmpty())
		{
			
			System.out.println("Our stack is Empty");
			return 'o';
		
		}
		else
		{
			
			int oldtop=top;
			top--;
			return(stackArray[oldtop]);
			
			
		}
		
	}
	
	public char peek()
	{
		
		return stackArray[top];
		
	}
	
	public boolean isFull()
	{
		
		return top==maxSize-1;
	}
	
	public boolean isEmpty()
	{
		
		return top==-1;
		
	}
	
	public static String reverseString(String str)
	{
		
		int stackSize= str.length();
		ReverseAStringUsingStack st= new ReverseAStringUsingStack(stackSize);
		for(int i=0;i<str.length();i++)
		{
			
			char ch= str.charAt(i);
			st.push(ch);
			
		}
		String result="";
		while(!st.isEmpty())
		{
			char ch= st.pop();
			result= result + ch;
			
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(reverseString("HELLO"));
	}
}
