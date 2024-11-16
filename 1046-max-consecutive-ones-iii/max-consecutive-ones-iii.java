class Solution {
    public int longestOnes(int[] nums, int k)
    {
        int j = -1, ans = 0;
        Queue<Integer> que = new LinkedList<>();

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 0) 
                que.add(i);
            if(que.size()>k)
                j = que.poll();
            ans = Math.max(ans, i-j);
        }
        return ans;
    }
}