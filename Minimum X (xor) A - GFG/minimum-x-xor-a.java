//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int a = Integer.parseInt(br.readLine().trim());
            int b = Integer.parseInt(br.readLine().trim());

            Solution ob = new Solution();
            out.println(ob.minVal(a, b));
        }
        out.flush();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution 
{
    public static int minVal(int a, int b) 
    {
    // return a^b;
    int setBitsb = Integer.bitCount(b);
    int setBitsa = Integer.bitCount(a);
    int ans = 0;

    for (int i = 0; i < 32; i++) 
    {
        int mask = 1 << i;
        //building mask: shifting 1 to ith index
        int set = a & mask;
        // if set =1 then ith index was 1 else 0

            // If i'th bit is set also set the
            // same bit in the required number
        if (set == 0 && setBitsb > setBitsa) 
        {
            // |= bitwise OR assignment ( |= ) 
            // operator uses the binary representation of both operands
            ans |= mask;
            setBitsb--;
            } 
        else if (set != 0 && setBitsa > setBitsb) 
        {
            setBitsa--;
        } 
        else 
        {
           ans |= set;
        }
    }
    return ans;
    }
}    