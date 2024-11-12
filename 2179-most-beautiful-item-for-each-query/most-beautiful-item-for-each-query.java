class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) 
    {

        TreeSet<Integer> set = new TreeSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        set.add(0);

        for(int[] arr: items)
        {
            int minval = map.get(set.floor(arr[0]));
            if(minval < arr[1])
            {
                map.put(arr[0],arr[1]);
                set.add(arr[0]);
            }
        }

        int max = -1;
        for(Integer i: set)
        {
            max = Math.max(max, map.get(i));
            map.put(i,max);
        }

        for(int i=0; i<queries.length; i++)
            queries[i] = map.get(set.floor(queries[i]));
            

        return queries;
    }
}