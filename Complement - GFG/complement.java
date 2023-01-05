//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String str = br.readLine().trim();

            Vector<Integer> ans = new Solve().findRange(str, n);
            if (ans.size() == 1) {
                System.out.println(ans.get(0));
            } else {
                System.out.println(ans.get(0) + " " + ans.get(1));
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solve {

    Vector<Integer> findRange(String str, int n) 
    {
        // code here
        Vector<Integer> ans = new Vector<>();
		List<Integer> l1 = new ArrayList<>();
		int maxsum = Integer.MIN_VALUE;
		int cursum = 0;
		int left = 0;
		int right = 0;
		
		for (int i = 0; i < n; i++) 
		{
			int num = str.charAt(i) == '0' ? 1 : -1;
			if (num > num + cursum) 
			{
				left = i;
				cursum = num;
			} 
			else 
			{
				cursum = num + cursum;
			}
			right = i;
			if (cursum > maxsum) 
			{
				l1.add(left + 1);
				l1.add(right + 1);
				maxsum = cursum;
			}
		}
		if (maxsum < 0) 
		{
			ans = new Vector<>();
			ans.add(-1);
			return ans;
		} 
		else 
		{
			ans.add(l1.get(l1.size() - 2));
			ans.add(l1.get(l1.size() - 1));
		}
		return ans;
        
    }
}