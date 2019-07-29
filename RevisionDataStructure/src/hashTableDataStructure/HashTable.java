package hashTableDataStructure;

public class HashTable 
{
	
	String[] hashArray;
	int arraySize;
	int size=0; // counter for no of elements in the hash Table
	
	public HashTable(int noOfSlots)
	{
		if(isPrime(noOfSlots))
		{
			hashArray= new String[noOfSlots];
			this.arraySize=noOfSlots;
		}
		else
		{
			
			int primeCount = getNextPrime(noOfSlots);
			hashArray= new String[primeCount];
			this.arraySize=primeCount;
			System.out.println("Hash table size which is given that is " +noOfSlots+ "is not a prime no");

			System.out.println("Hash table size changed to " +primeCount);
			
		}
		
	}
	
	
	private boolean isPrime(int no)
	{
		for(int i=2; i*i<= no; i++)
		{
			if(no%i==0)
			{
				
				return false;
			}
			
		}
		return true;
		
		
	}
	
	private int getNextPrime(int minNo)
	{
		
		for(int i = minNo; true; i++)
		{
			if(isPrime(i));
			{
			return i;
			}
	}
	}
	
 
	// this will return preferred index position 
	private int hashFunc1(String word )
	{
		int hashVal=word.hashCode();
		hashVal= hashVal% arraySize;
		if(hashVal<0)
		{
			hashVal+=arraySize;
			
		}
		return hashVal; // ideal indexPosition we'd like to insert or search in
		
	}
	
	// this is going to return step size greater than 0
	private int hashFunc2(String word)
	{
		int hashVal= word.hashCode();
		hashVal= hashVal% arraySize;
		if(hashVal<0)
		{
			hashVal+=arraySize;
			
		}
		return 3-hashVal%3; // no choosen must be prime and less than the array size 
		
	}
	
	public void insert(String word)
	{
		int preferredIndex=hashFunc1(word);
		int stepSize=hashFunc2(word);
		while (hashArray[preferredIndex]!=null)
		{
			preferredIndex=preferredIndex+stepSize;
			preferredIndex= preferredIndex%arraySize;
		}
		
		hashArray[preferredIndex]=word;
		System.out.println("Inserted word is: " +word );
		size++;
		
		
	}
	

	public String find(String word)
	{
		int preferredIndex=hashFunc1(word);
		int stepSize=hashFunc2(word);
		while (hashArray[preferredIndex]!=null)
		{
			if(hashArray[preferredIndex].equals(word))
			{
				
				return hashArray[preferredIndex];
			}
			preferredIndex=preferredIndex+stepSize;
			preferredIndex= preferredIndex % arraySize;
		}
		
		return hashArray[preferredIndex];
	}
	
	
	public void displayTable()
	{
		System.out.println("Table.....");
		for(int i=0;i<arraySize; i++)
		{
			
			if(hashArray[i]!=null)
			{
				
				System.out.print(hashArray[i] + " ");
			}
			else
			{
				System.out.print("** ");
				
			}
			System.out.println("");
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		HashTable hash= new HashTable(500);
		hash.insert("Apple");
		hash.insert("Hello");
		hash.insert("Feeling");
		hash.insert("Water");
		hash.insert("Africa");
		hash.insert("Seed");
		hash.insert("Phone");
		hash.insert("September");
		hash.insert("Micheal");
		hash.insert("Milk");
		hash.insert("Huge");
		hash.insert("Dog");
		
		hash.displayTable();
		
		//Finding those Words....
		
		System.out.println("-----Finding Elements---------");
		System.out.println(hash.find("Apple"));
		System.out.println(hash.find("Zebra"));
		System.out.println(hash.find("Feeling"));
		System.out.println(hash.find("Water"));
		System.out.println(hash.find("Africa"));
		System.out.println(hash.find("Feeling"));


		

		
		
	}

}

