class Solution {
    public int removeElement(int[] nums, int val) {
        int ans = 0, n = nums.length;
        for(int i=0; i<n; i++)
        {
            while(i<n && nums[i]==val){
                ans++;
                i++;
            }
            if(i!=n)
            nums[i-ans] = nums[i];
        }
        return n-ans;
    }
}