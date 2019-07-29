package queueDS;

public class Queue {
	
	private int maxSize;// maintain/initialise certain set of slots.
    private long[] queueArray;//slots to maintain data elements.
    private int rear;//index position for the element in the front.
    private int front;//index position for the element in the back.
    private int nitems;//counter to maintain the no of items in our queue.
    
    
    public Queue(int size)
    {
        this.maxSize=size;
        this.queueArray=new long[maxSize];
        front=0;
        rear=-1;
        nitems=0;
    }
    
    public void insert(long data)
    {
        if(rear==maxSize-1)
        {
            rear=-1;         // circular Queue Overridden approach.
            
        }
        rear++;
        queueArray[rear]=data;
        nitems++;
        
    }
    
    public long remove()
    {
        long temp= queueArray[front];
        front++;
        if(front==maxSize)
        {
            front=0; // we set front to 0 so that we can utilise the entire array again.
            
            
        }
        nitems--;
        return temp;
        
    }
    
    public long peek()
    {
        return queueArray[front];
    }
    
    public boolean isEmpty()
    {
        return (nitems==0);
    }
    public boolean isfull()
    {
        return (nitems==maxSize);
    }
    
    public void view()
    {
        
        System.out.print("[");
        for(int i=0;i<queueArray.length;i++)
        {
            System.out.print(queueArray[i]+ " ");
            
        }
        System.out.print("]");
        
    }
    
    public static void main(String[] args) 
    {
        Queue qt= new Queue(5);
        qt.insert(50);
        qt.insert(60);
        qt.insert(80);
        qt.insert(10);
        qt.insert(25);
        qt.view();
        qt.insert(99999);
        qt.insert(99999);
        qt.view();
        
    }
}