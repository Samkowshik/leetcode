class Solution 
{
    public int isPrefixOfWord(String sentence, String word) 
    {
        int ans = 0, n = sentence.length(), m = word.length();
        char p = ' ';

        for(int i=0; i<=n-m; i++)
        {
            if(p==' ')
            {
                ans++;
                boolean f = true;
                for(int j=0; j<m && f; j++)
                    if(sentence.charAt(i+j)!=word.charAt(j))
                        f = false;
                if(f) return ans;
            }
            p = sentence.charAt(i);
        }
        
        return -1;
    }
}