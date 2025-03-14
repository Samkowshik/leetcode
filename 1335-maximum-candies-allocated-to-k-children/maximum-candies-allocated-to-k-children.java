class Solution 
{
    static boolean sam(int m, long k, int[] candies)
    {
        if(m==0) return true;

        for(int i=candies.length-1; i>=0 && k>0; i--)
            k -= candies[i]/m;
        
        return k<=0;
    }
    public int maximumCandies(int[] candies, long k) 
    {
        Arrays.sort(candies);

        int l = 0, r = candies[candies.length-1], m = 0, ans = 0;
        while(l<=r)
        {
            m = (l+r)/2;
            if(sam(m,k,candies)){
                ans = m;
                l = m+1;
            }
            else
                r = m-1;
        }
        return ans;
    }
}