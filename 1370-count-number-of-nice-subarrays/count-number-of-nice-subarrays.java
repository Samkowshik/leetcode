class Solution 
{
    public int numberOfSubarrays(int[] nums, int k) 
    {
        int n = nums.length;
        List<Integer> lst = new ArrayList<>();
        lst.add(-1);
        for(int i=0; i<n; i++)
            if(nums[i]%2==1) 
                lst.add(i);
        lst.add(n);

        int ans = 0;
        for(int i=1; i<lst.size()-k; i++)
            ans += (lst.get(i)-lst.get(i-1))*(lst.get(i+k)-lst.get(i+k-1));
            
        return ans;
    }
}