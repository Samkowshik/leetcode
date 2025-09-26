class Solution 
{
    int indexOf(int[] nums, int k)
    {
        int l = 0, r = nums.length-1, m = 0, ans = 0;
        if(nums[r] < k) return r+1;

        while(l<=r){
            m = (l+r)/2;
            if(nums[m] >= k){
                r = m-1;
                ans = m;
            }
            else
                l = m+1;
        }
        return ans;
    }
    public int triangleNumber(int[] nums) 
    {
        Arrays.sort(nums);
        int n = nums.length, ans = 0;
        for(int i=0; i<n-2; i++)
        for(int j=i+1; j<n-1; j++){
            int val = indexOf(nums, nums[i]+nums[j])-j-1;
            ans += val>0? val : 0;
        }
    
        return ans;
    }
}