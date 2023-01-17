//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int a[], int n) 
    {
        // code here
     Queue<Integer> q1=new LinkedList<>();
        Queue<Integer> q2=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(a[i]>=0)
            q1.add(a[i]);
            else
            q2.add(a[i]);
        }
        for(int i=0;i<n;)
        {
            if(!q1.isEmpty())
            {
                a[i]=q1.peek();
                q1.remove();
                i++;
            }
            if(!q2.isEmpty())
            {
                a[i]=q2.peek();
                q2.remove();
                i++;
            }
        }
    }
}