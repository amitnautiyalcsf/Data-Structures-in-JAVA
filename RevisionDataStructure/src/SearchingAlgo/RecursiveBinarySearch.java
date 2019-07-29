package SearchingAlgo;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
	int arr[]={2,5,6,9,10,14,18,90,100,109,303,1009,1990};
	 System.out.println("The value find at location " +recursiveBinary(arr,90,0,12));
	   System.out.println("The value find at location " +recursiveBinary(arr,1008,0,12));

	}
	
	public static int recursiveBinary(int arr[], int x,int start,int end)
	{
		
		if(start>end)
		{
			
			return-1;
			
			
		}
		else
		{
			
			int mid=(start+end)/2;
			if(arr[mid]==x)
			{
				return mid;
				
			}
			else if(arr[mid]>x)
			{
				
				return recursiveBinary(arr,x,start,mid-1);
				
			}
			else
			{
				
				return recursiveBinary(arr,x,mid+1,end);
				
			}
			
		}
		
	}
	

}
