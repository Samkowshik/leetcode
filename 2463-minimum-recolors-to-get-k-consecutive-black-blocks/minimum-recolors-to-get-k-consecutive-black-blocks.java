class Solution 
{
    public int minimumRecolors(String blocksString, int k) 
    {
        int w = 0, b = 0;
        char[] blocks = blocksString.toCharArray();
        for(int i=0; i<k; i++)
            if(blocks[i]=='W') w++;
            else b++;
        int ans = w;
        for(int i=k; i<blocks.length; i++)
        {
            if(blocks[i]=='W') w++;
            else b++;
            if(blocks[i-k]=='W') w--;
            else b--;
            ans = Math.min(w,ans);
        }

        return ans;
    }
}