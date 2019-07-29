package SearchingAlgo;

public class SimpleLinearSearch {
public static void main(String[] args) {
	
	int arr[]= {12,13,18,19,20,99,1000,22,33,5342,11,323};
	System.out.println("The value find at location " +linearSearch(arr,1000));
	
	System.out.println("The value find at location " +linearSearch(arr,13));
}


public static int linearSearch(int arr[], int x)
{
	
	for(int i=0;i<arr.length;i++)
	{
		
		if(arr[i]==x)
		{
			return i;
		}
	}
	return -1;

}
}
