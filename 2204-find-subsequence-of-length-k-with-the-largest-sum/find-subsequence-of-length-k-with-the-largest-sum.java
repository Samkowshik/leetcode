class Solution 
{
    public int[] maxSubsequence(int[] nums, int k) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele: nums)
        {
            pq.add(ele);
            if(pq.size()>k) 
                pq.poll();
        }

        List<Integer> list = new ArrayList<>();
        while (!pq.isEmpty())
            list.add(pq.poll()); 

        // System.out.println(list);

        int[] ans = new int[k];
        int i = 0;
        for(int ele: nums)
        {
            int ind = Collections.binarySearch(list, ele);
            if(ind >= 0)
            {
                ans[i++] = ele;
                list.remove(ind);
            }
        }

        return ans;
    }
}