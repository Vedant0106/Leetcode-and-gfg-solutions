class Solution {
    public int threeSumClosest(int[] nums, int target) 
    {
        int t= target;
        Arrays.sort(nums);
        int n=nums.length;
        int sum=nums[0]+nums[1]+nums[n-1];
        int curr=0;
        for(int i=0 ; i<n-2 ; i++)
        {
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                curr=nums[i]+nums[j]+nums[k];
                
                if(curr<=target)   j++;        
                else     k--;
                
                if(Math.abs(sum-t)>Math.abs(curr-t))     
                    sum=curr;       
            }
        }
        return sum;
    }
}  