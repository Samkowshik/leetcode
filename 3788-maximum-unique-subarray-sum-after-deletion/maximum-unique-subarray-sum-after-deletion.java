class Solution {
    public int maxSum(int[] nums) 
    {
        int ans = 0, maxn = -100;
        Set<Integer> set = new HashSet<>();

        for(int i: nums)
            if(i>0){
                if(set.add(i))
                    ans += i;
            } 
            else 
            maxn = Math.max(maxn,i);
         
        return ans == 0? maxn : ans;
    }
}