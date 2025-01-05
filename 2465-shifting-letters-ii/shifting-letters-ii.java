class Solution 
{
    public String shiftingLetters(String s, int[][] shifts) 
    {
        int n = s.length();
        int[] pre = new int[n+1];

        for(int[] shift : shifts)
        if(shift[2] == 1){
            pre[shift[0]] += 1;
            pre[shift[1]+1] += -1;
        }
        else{
            pre[shift[0]] += -1;
            pre[shift[1]+1] += 1;
        }

        for(int i=1; i<n; i++)
            pre[i] += pre[i-1];

        char[] ans = s.toCharArray();
        for(int i=0; i<n; i++)
        {
            ans[i] += pre[i]%26;
            if(ans[i]>122)
                ans[i] = (char)(96+ans[i]-'z');
            else if(ans[i]<97)
                ans[i] = (char)(123-'a'+ans[i]);
        }

        return new String(ans);
    }
}