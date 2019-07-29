package SortingAlgorithms;

import java.util.Arrays;

// Heart of this algo is Partition
public class QuickSort // Avg run time O(nlog(n))
                       // worst run time O(n^2)
{
	
	
	public static void quickSort(int inputArray[],int start, int end)
	{
		
		if(start<end)
		{
			
			int q= partition(inputArray,start,end);// index position of the correctly placed value in the array
			quickSort(inputArray,start,q-1);//sorts the left half of the range
			quickSort(inputArray,q+1,end);// sorts the right half of the range
			
			
		}
		
	}
	
	public static int partition(int inputArray[], int start, int end)
	{
		int x= inputArray[end];// here x is taken as pivot value
		
		// in the first iteration , i starts from -1
		int i=start-1;
		int temp;
		for(int j= start ; j<=end-1; j++)
		{
			if(inputArray[j]<=x)
			{
				
				i=i+1;
				// temp variable is used for swapping
				temp=inputArray[i];
				inputArray[i]=inputArray[j];
				inputArray[j]=temp;
				
			}
			
			
		}
		 // put the pivot value in the correct slot next
		int temp1= inputArray[i+1];
		inputArray[end]= temp1;
		inputArray[i+1]= x; // here pivot value is placed in the correct slot of the array.
		return i+1;
		
		
	}
	
	public static void main(String[] args) {
		int myArray[]= {15,90,28,17,89,37,200,19};
		quickSort(myArray,0,myArray.length-1);
		System.out.println(Arrays.toString(myArray));
		
	}
	

}
