package SearchingAlgo;

public class RecursiveLinearSearch {
public static void main(String[] args) {

	int arr[]={9,8,99,110,8,87,637,8,3,13,87,12,99};
	System.out.println("The value find at location " +recursiveLinear(arr,1000,0));
	System.out.println("The value find at location " +recursiveLinear(arr,13,0));
}

public static int recursiveLinear(int arr[],int x,int i)
{
	
 
	if(i>arr.length-1)
 {
	 
	 return -1;
 }
 
    else if(arr[i]==x)
 {
		return i;
		
 }
	else
 {
		return recursiveLinear(arr,x,i+1);
		
 }

}
}
