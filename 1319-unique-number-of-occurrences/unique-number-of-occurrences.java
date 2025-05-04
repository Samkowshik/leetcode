class Solution {
    public boolean uniqueOccurrences(int[] arr) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr)
        map.put(i, map.getOrDefault(i,0)+1);

        int n = map.values().size();
        int m = new HashSet<>(map.values()).size();
        return n==m;
    }
}