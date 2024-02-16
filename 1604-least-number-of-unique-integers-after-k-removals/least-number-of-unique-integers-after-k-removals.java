class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) 
    {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i: arr)
        mp.put(i, mp.getOrDefault(i,0)+1);
        List<Integer> lst = new ArrayList(mp.values());
        Collections.sort(lst);

        int ans = mp.size();
        for(int i: lst)
        {
            if(k-i>=0)
            {
                k-=i;
                ans--;
            }
            else break;
        }
        return ans;
    }
}