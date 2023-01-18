//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
          int n = arr.length;

        for (int i = 0; i < n; i++) 
        {
            if (arr[i] <= 0) 
                arr[i] = n + 1;
        }

        for (int i = 0; i < n; i++) 
        {
            int index = Math.abs(arr[i])-1;
            if (index < n && arr[index] > 0) 
            {
                arr[index] = -arr[index];
            }
        }

        for (int i = 0; i < n; i++) 
        {
            if (arr[i] > 0) 
                return i+1 ;
        }
    return n+1 ;
    }
}


//{ Driver Code Starts.

class Main
{   
    public static void main (String[] args) 
    {

		Scanner sc=new Scanner(System.in);
		
        //taking testcases
		int t=sc.nextInt();
		while(t-->0){
		    
		    //input number n
			int n=sc.nextInt();
			int[] arr=new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
				
			Solution obj = new Solution();
			
			//calling missingNumber()
			int missing = obj.missingNumber(arr,n);
			System.out.println(missing);
		}
    }
}


// } Driver Code Ends