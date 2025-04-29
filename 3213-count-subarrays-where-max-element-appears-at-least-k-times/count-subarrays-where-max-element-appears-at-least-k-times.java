class Solution 
{
    public long countSubarrays(int[] nums, int k) 
    {
        int n = nums.length, max = 0;
        for(int i: nums) max = Math.max(max, i);

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++)
            if(nums[i]==max && k--<2)
                q.add(i);

        long ans= 0;
        for(int i=0; i<n && !q.isEmpty(); i++)
        {
            ans += n-q.peek();
            if(nums[i]==max)
                q.poll();
        }

        return ans;
    }
}