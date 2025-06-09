class Solution {
    public boolean wordPattern(String pattern, String s) 
    {
        String[] sarr = s.split(" ");
        if(sarr.length != pattern.length()) return false;
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();

        for(int i=0; i<sarr.length; i++)
        {
            if(map1.containsKey(pattern.charAt(i)) && map2.containsKey(sarr[i]))
            {
                if(!map1.get(pattern.charAt(i)).equals(sarr[i]) || map2.get(sarr[i]) != pattern.charAt(i))
                    return false;
                // System.out.println(i);
            }
            else if(!(map1.containsKey(pattern.charAt(i)) || map2.containsKey(sarr[i])))
            {
                map1.put(pattern.charAt(i), sarr[i]);
                map2.put(sarr[i], pattern.charAt(i));
            }
            else return false;
        }
        return true;
    }
}