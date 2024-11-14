class Solution 
{

    public List<List<String>> groupAnagrams(String[] strs)
    {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String s: strs)
        {
            char[] sa = s.toCharArray();
            Arrays.sort(sa);
            String ss = new String(sa);

            List<String> lst = map.getOrDefault(ss, new ArrayList<>());
            lst.add(s);

            map.put(ss, lst);

        }
        
        for(List<String> lst: map.values())
        ans.add(lst);

        return ans;
    }
}