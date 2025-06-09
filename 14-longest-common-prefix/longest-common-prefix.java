class Solution 
{
    static int lcp(String s, String t, int k)
    {
        for(int i=0; i<k; i++)
        {
            if(i==s.length() || s.charAt(i)!=t.charAt(i))
                return i;
        }
        return k;
    }
    public String longestCommonPrefix(String[] strs) 
    {
        int ans = strs[0].length();
        for(String s : strs)
        ans = lcp(s, strs[0], ans);

        return strs[0].substring(0,ans);
    }
}