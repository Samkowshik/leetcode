class Solution 
{
    public int[] countBits(int n) 
    {
        int[] ans = new int[n+1];
        if(n==0) return ans;
        ans[1] = 1;
        if(n==1) return ans;

        int x = 2;
        for(int i=2; i<=n; i++)
        {
            if(i==2*x) x = i;
            ans[i] = ans[i-x]+1;
        }
        return ans;
    }
}