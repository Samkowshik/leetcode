class Solution {
    public List<String> findRepeatedDnaSequences(String s) 
    {
        List<String> ans = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<s.length()-9; i++)
        {
            String str = s.substring(i,i+10);
            Integer val = map.getOrDefault(str,0);
            map.put(str, 1+val);
            if(val==1)
                ans.add(str);
        }
        return ans;
    }
}