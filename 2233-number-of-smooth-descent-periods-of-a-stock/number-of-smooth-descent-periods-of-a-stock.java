class Solution {
    public long getDescentPeriods(int[] nums) 
    {
        int n = nums.length;
        long ans =n, j = 0;
        for(int i=0; i<n-1; i++)
        {
            j = i;
            while(i<n-1 && nums[i+1]-nums[i] == -1)
            i++;

            ans += ((i-j+1)*(i-j))/2;
        }
        return ans;
    }
}