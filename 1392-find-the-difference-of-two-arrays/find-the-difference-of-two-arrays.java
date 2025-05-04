class Solution 
{
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) 
    {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int i: nums1)
            s1.add(i);
        for(int i: nums2)
            s2.add(i);

        for(int i: nums1)
            s2.remove(i);
        for(int i: nums2)
            s1.remove(i);
        
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(s1));
        ans.add(new ArrayList<>(s2));
        
        return ans;
    }
}