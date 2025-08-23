class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        int dif = 0, n = nums.length, j = 0, ans = 0;
        for(int i=0; i<n-1; )
        {
            dif = nums[i+1]-nums[i];
            j = i;
            while(i<n-1 && nums[i+1]-nums[i] == dif)
            i++;

            ans += ((i-j-1)*(i-j))/2;
        }

        return ans;
    }
}