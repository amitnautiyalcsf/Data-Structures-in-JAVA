package SortingAlgorithms;

public class SelectionSort // complextity O(n^2)
{

	public static int[] selectionSort(int arr[])
{
	for(int i=0;i<arr.length-1;i++)
	{
		
		int minimum=i;
		for(int j=i+1; j<arr.length;j++)
		{
			if(arr[j]<arr[minimum])
			{
				minimum=j;
				
			}
			
		}
		
		int temp=arr[i];
		arr[i]=arr[minimum];
		arr[minimum]=temp;
		
	}
	
	return arr;

}
	
	public static void main(String[] args) {
		int myArray[]= selectionSort(new int[]{23,32,49,19,16,29});
		
		for(int i=0;i<myArray.length;i++)
		{
			
			System.out.println(myArray[i]);
		}
	}
}
