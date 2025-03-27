class Solution 
{
    public int minimumIndex(List<Integer> nums) 
    {
        int n = nums.size(), maj = 0, c = 0, mc = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums)
        {
            c = map.getOrDefault(i,0)+1;
            if(c>mc){
                mc = c;
                maj = i;
            }
            map.put(i, c);
        }

        c = 0;
        for(int i=0; i<n; i++)
        {
            if(nums.get(i)==maj) c++;
            if(c>(i+1)/2 && mc-c>(n-i-1)/2)
            return i;
        }

        return -1;
    }
}