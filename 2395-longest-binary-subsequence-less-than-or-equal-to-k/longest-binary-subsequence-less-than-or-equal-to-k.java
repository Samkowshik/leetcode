class Solution 
{
    public int longestSubsequence(String str, int k) 
    {
        int ans = 0;
        char[] s = str.toCharArray();
        for(char c : s) if(c=='0') ans++;
        long temp = 0, mask = 1;
        for(int i=s.length-1; temp<=k && i>=0 && i>=s.length-31; i--)
        {
            if(s[i]=='1'){
                // System.out.println(temp);
                temp = mask|temp;
                ans++;
            } 
            mask <<= 1;
        }
        return temp>k? ans-1: ans;
    }
}