class Solution 
{
    public boolean isSubsequence(String s, String t) 
    {
        if(s.length() == 0) return true;
        if(t.length() < s.length()) return false;
        int j = 0;
        for(char c : t.toCharArray())
        {
            if(c==s.charAt(j)) j++;
            if(j==s.length()) return true;
        }
        return false;
    }
}