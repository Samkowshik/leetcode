class Solution 
{
    public int maximumLength(int[] nums) 
    {
        int evenCount = 0, oddCount = 0, count = 0, n = nums.length;
        for(int i=0; i<n; count++)
        {
            if(nums[i]%2 == 0)
            while(i<n && nums[i]%2 == 0){
                evenCount++;
                i++;
            }
            else
            while(i<n && nums[i]%2 == 1){
                oddCount++;
                i++;
            }
        }
        return Math.max(count, Math.max(evenCount, oddCount));
    }
}