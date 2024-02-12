class Solution {
    public int majorityElement(int[] nums) 
    {
        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums.length/2;

        for(int i: nums)
        {
            int c = mp.getOrDefault(i,0);
            if(c==n) return i;
            mp.put(i,c+1);
        }

        return 0;
    }
}