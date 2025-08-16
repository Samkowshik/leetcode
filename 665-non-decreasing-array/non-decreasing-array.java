class Solution 
{
    public boolean checkPossibility(int[] nums) 
    {
        int drpInd = -1, n = nums.length;
        for(int i=1; i<n; i++){
            if(nums[i-1] > nums [i]){
                if(drpInd == -1)
                drpInd = i-1;
                else
                return false;
            }
        }
        // System.out.println(drpInd);

        if(drpInd <= 0 || drpInd == n-2) return true;
        if(nums[drpInd-1] <= nums[drpInd+1]) return true;
        if(nums[drpInd] <= nums[drpInd+2]) return true;

        return false;
    }
}