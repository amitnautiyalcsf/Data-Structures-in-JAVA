package SearchingAlgo;

public class SimpleBinarySearch {
public static void main(String[] args) {
	
	int arr[]= {2,5,6,9,10,14,18,90,100,109,303,1009,1990};
	System.out.println("The Value find at " +binary(arr,100));
	System.out.println("The Value find at " +binary(arr,90));
	
	
}

public static int binary(int arr[], int x)
{

	int start=0;
	int end=arr.length-1;
	
	while(start<=end)
	{
		
		int mid= (start+end)/2;
		if(arr[mid]>x)
		{
			end=mid-1;
			
			
		}
		else if(arr[mid]==x)
		{
			
			return mid;
			
		}
		else
		{
			start=mid+1;
		} 
	}
	return -1;
	
}
}
