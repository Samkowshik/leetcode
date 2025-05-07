class Solution 
{
    static void reverse(int[] nums, int i, int j)
    {
        for(int k=0; k<=(j-i-1)/2; k++)
        {
            int t =nums[i+k];
            nums[i+k] = nums[j-k];
            nums[j-k] = t;
        }
    }
    public void rotate(int[] nums, int k) 
    {
        int n = nums.length;
        if(n==1) return;
        k %= n;
        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);

    }
}