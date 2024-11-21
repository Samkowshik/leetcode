class Solution {
    public int maxOperations(int[] nums, int k) 
    {
        Arrays.sort(nums);
        int i=0, j = nums.length-1;
        while(j>=0 && nums[j]>=k)j--;

        int ans = 0;
        while(i<j)
        {
            if(nums[i]+nums[j]==k) {
                ans++;
                i++;
                j--;
            }
            else if(nums[i]+nums[j]<k) i++;
            else j--;
        }
        return ans;
    }
}