class Solution 
{
    int max(int[] nums)
    {
        int max = 0;
        for(int i : nums) 
            max = Math.max(max, i);
        return max;
    }
    public int[] smallestSubarrays(int[] nums) 
    {
        int[] pos = new int[31];

        for(int i=nums.length-1; i>=0; i--){
            int k = 1;
            while(nums[i]>0){
                if((nums[i] & 1) == 1)
                    pos[k] = i;
                nums[i]>>=1;
                k++;
            }
            nums[i] = max(pos)-i+1;
            if(nums[i] < 1) nums[i] = 1; 
        }
        return nums;
    }
}