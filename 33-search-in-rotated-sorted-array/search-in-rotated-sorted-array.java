class Solution 
{
    int findBlackSheep(int[] nums)
    {
        int l = 0, r = nums.length-1, m = 0;
        while(l<=r){
            m = (l+r)/2;
            if(nums[l]<nums[m] && nums[r]<nums[m])
            l = m;
            else if(nums[l]>nums[m] && nums[r]>nums[m])
            r = m;
            else break;
        }
        if(l != nums.length-1 && nums[l+1]<nums[l])
            l++;

        return l;
    }
    int findElement(int[] nums, int l, int r, int target)
    {
        int m = 0;
        while(l<=r){
            m = (l+r)/2;
            if(nums[m] < target)
            l = m+1;
            else if(nums[m] > target)
            r = m-1;
            else
            return m;
        }

        return -1;
    }
    public int search(int[] nums, int target) 
    {
        int n = nums.length;
        if(n==1) return nums[0] == target? 0:-1;
        int blackSheep = findBlackSheep(nums); 
        return Math.max(findElement(nums, 0, blackSheep-1, target),findElement(nums, blackSheep, n-1, target));
    }
}