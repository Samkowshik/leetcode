class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
        char[] map1 = new char[200];
        char[] map2 = new char[200];
        for(int i=0; i<s.length(); i++)
        {
            int i1 = s.charAt(i), i2 = t.charAt(i);
            if(map1[i1] == '\u0000' && map2[i2] == '\u0000')
            {
                map1[i1] = t.charAt(i);
                map2[i2] = s.charAt(i);
            }
            else if((map1[i1] == '\u0000' ^ map2[i2] == '\u0000') || map1[i1] != t.charAt(i) || map2[i2] != s.charAt(i))
                return false;

        }
        return true;
    }
}