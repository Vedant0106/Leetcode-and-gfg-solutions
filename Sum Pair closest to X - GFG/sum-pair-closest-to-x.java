//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob = new Solution();
            int ans[] = ob.sumClosest(arr, x);
            System.out.print(ans[0]+" "+ans[1]);
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int[] sumClosest(int[] arr, int x) 
    {
        // code here 
        int ans[]=new int[2];

       

       int lo=0;

       int hi=arr.length-1;

       ans[0]=arr[0];

       ans[1]=arr[1];

       while(lo<hi){

           int s1=ans[0]+ans[1];

           int s=arr[lo]+arr[hi];

           if(Math.abs(x-s)<Math.abs(x-s1))

           {

               ans[0]=arr[lo];

               ans[1]=arr[hi];

           }

           

           if(s>x){

               hi--;

               

           }

           else

           lo++;

       }

       return ans;
    }
}