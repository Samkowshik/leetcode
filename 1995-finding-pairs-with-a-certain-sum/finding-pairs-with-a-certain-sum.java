class FindSumPairs 
{
    int[] nums1, nums2;
    Map<Integer, Integer> frq1, frq2;
    List<Integer> lst1;
    public FindSumPairs(int[] nums1, int[] nums2) 
    {
        this.nums1 = nums1;
        this.nums2 = nums2;
        frq1 = new HashMap<>();
        frq2 = new HashMap<>();

        for(int i: nums1)
        frq1.put(i, frq1.getOrDefault(i,0)+1);
        lst1 = new ArrayList(frq1.keySet());
        Collections.sort(lst1);

        for(int i: nums2)
        frq2.put(i, frq2.getOrDefault(i,0)+1);
    }
    
    public void add(int index, int val) 
    {
        frq2.put(nums2[index], frq2.get(nums2[index])-1);
        nums2[index] += val;
        frq2.put(nums2[index], frq2.getOrDefault(nums2[index],0)+1);
    }
    
    public int count(int tot) 
    {
        // System.out.println(Arrays.toString(nums2));
        // System.out.println(frq2);
        int ans = 0;
        for(Integer key : lst1){
            if(key >= tot) break;
            Integer val = frq2.get(tot-key);
            if(val!= null)
            ans += frq1.get(key)*val;
            // System.out.println(ans);
        }
        return ans;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */