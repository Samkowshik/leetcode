class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) 
    {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0; i<k; i++){
            while(!dq.isEmpty() && nums[dq.getLast()] < nums[i])
                dq.removeLast();
            dq.add(i);
        }
        ans[0] = nums[dq.getFirst()];

        for(int i=k; i<n; i++){
            while(!dq.isEmpty() && dq.getFirst() <= i-k)
                dq.removeFirst();

            while(!dq.isEmpty() && nums[dq.getLast()] < nums[i])
                dq.removeLast();
            dq.add(i);
            // for(Integer ele : dq)
            // System.out.print(nums[ele]+" ");
            // System.out.println();

            ans[i-k+1] = nums[dq.getFirst()];
        }

        return ans;
        
    }
}