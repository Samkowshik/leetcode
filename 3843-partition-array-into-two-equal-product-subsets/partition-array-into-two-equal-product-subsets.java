class Solution 
{
    long product(int[] nums, int bit)
    {
        int i=0;
        long prod = 1;
        while(bit>0)
        {
            if((bit&1) == 1)
            prod *= nums[i];

            bit>>=1;
            i++;
        }

        return prod;
    }
    public boolean checkEqualPartitions(int[] nums, long target) 
    {
        double prod = 1;
        for(int i : nums)
        prod *= i;

        if(Math.sqrt(prod) != target) return false;

        for(int i=1; i<(1<<nums.length-1); i++){
            if(product(nums, i) == target)
                return true;
        }

        return false;
    }
}