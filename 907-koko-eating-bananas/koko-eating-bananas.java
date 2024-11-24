class Solution 
{
    static int max(int[] piles)
    {
        int ans = 0;
        for(int i: piles)
        ans = Math.max(ans,i);
        
        return ans;
    }
    static boolean sam(int[] piles, int h, int x)
    {
        for(int i: piles)
        {
            h-= i/x+ (i%x>0? 1:0);
            if(h<0) return false;
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) 
    {
        int l = 1, r = max(piles), ans=0, m;
        while(l<=r)
        {
            m = (l+r)/2;
            if(sam(piles, h, m)){
                ans = m;
                r = m-1;
            }
            else l = m+1;
        }

        return ans;
    }
}