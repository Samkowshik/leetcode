class Solution 
{
    public int findLucky(int[] arr) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        int max = -1;
        for(int i : arr)
            map.put(i, map.getOrDefault(i,0)+1);
        for(Integer i: map.keySet())
        if(i==map.get(i) && i>max)
        max = i;
        return max;
    }
}