package SortingAlgorithms;

public class InsertionSort // complextity O(n^2)
{
	
	public static int[] insertion(int arr[]) // In insertionSort we maintain sorting in the sorted area 
	{
		for(int i=1;i<arr.length; i++)
		{
			int element=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>element)
			{
				arr[j+1]=arr[j];
				j--;
				
			}
			
			arr[j+1]=element;
		}
		
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		int myArray[]= insertion(new int[]{23,32,49,19,16,29,99,100,1});
		
		for(int i=0;i<myArray.length;i++)
		{
			System.out.println(myArray[i]);
			
		}
		
		
	}

}
