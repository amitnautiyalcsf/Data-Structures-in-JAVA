package SortingAlgorithms;


// Two Major Steps
// 1.Splitting
// 2.Merging

public class MergeSort //O(nlogn)
{
	public static void main(String[] args) 
	{
	  int inputArray[] = {12,81,74,43,1093,0,8,92,17,754,912,0,6,4};
	    mergeSort(inputArray);
	  for(int i=0;i<inputArray.length;i++)
	  {
	  System.out.println(inputArray[i]);    
	  }
	}
	public static void mergeSort(int inputArray[])
{
    mergeSort(inputArray,0,inputArray.length-1);
    
}
	public static void mergeSort(int inputArray[],int start, int end)
     {
         if(end<=start)//we are done traversing the array.
         {
             return;
             
         }
      
         int mid= (start+end)/2;
         mergeSort(inputArray,start,mid);// sort left half
         mergeSort(inputArray,mid+1,end);// sort right half
         merge(inputArray,start,mid,end);// merge sorted results into the input array
     }
         
     
     
     public static void merge(int inputArray[],int start, int mid, int end)
     {
         int tempArray[]= new int[end-start+1];
         int leftslot=start;// index counter for the left side of the array.
         int rightslot=mid+1;//index counter for the right side of the array.
         int k =0;
         while(leftslot<=mid && rightslot<=end)
         {
             if(inputArray[leftslot]<inputArray[rightslot])
             {
                 tempArray[k]=inputArray[leftslot];
                 leftslot=leftslot+1;
             }
             else
             {
                 tempArray[k]=inputArray[rightslot];
                 rightslot=rightslot+1;
                 
             }
             
             
            k++;  
         }
        
         // When it gets to here that meansthe above loop has completed. so either the rightside or the leftSide of the subarray has been sorted.

        if(leftslot<=mid)// right side has been sorted.
        {
            while(leftslot<=mid)// Now we can just copy over the rightside elemens.
            {
                tempArray[k]=inputArray[leftslot];
                leftslot++;
                k++;
                
            }
        }
            else if(rightslot<=end)// left side has been sorted right is still remaining.
            {
                while(rightslot<=end)
                {
                    tempArray[k]=inputArray[rightslot];
                    rightslot++;
                    k++;
                    
                }
                
            }
            
            //copy over the tempArray into the appropriate slots of the inputArray for further processing.
            for(int i=0; i<tempArray.length;i++)
            {
                inputArray[start+i]=tempArray[i];
                
            }
            
        }
    }