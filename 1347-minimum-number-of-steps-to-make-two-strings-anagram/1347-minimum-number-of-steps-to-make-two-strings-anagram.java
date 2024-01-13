class Solution {
    public int minSteps(String s, String t) 
    {
        int[] hm = new int[26];
        for(char i: t.toCharArray()) 
            ++hm[i-'a'];
        for(char i: s.toCharArray())
            if(hm[i-'a']>0) 
                --hm[i-'a'];
        int ans =0;
        for(int i: hm) ans+=i;
        return ans;
    }
}