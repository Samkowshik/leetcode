class Solution 
{
    public int countPalindromicSubsequence(String s) 
    {
        TreeSet<Integer>[] set = new TreeSet[26];
        for(int i=0; i<26; i++) 
            set[i] = new TreeSet<>(); 
        
        for(int i=0; i<s.length(); i++)
            set[s.charAt(i)-'a'].add(i);

        int ans = 0;
        for(int i=0; i<26; i++) 
        {
            if(set[i].size()<=1) continue;
            Integer a = set[i].first(), b = set[i].last();
            for(int j=0; j<26; j++)
            {
                Integer c = set[j].ceiling(a+1);
                if(c!=null && c<b)
                    ans++;
            }
        }
        
        return ans;
    }
}