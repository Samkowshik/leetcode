class Solution 
{
    static boolean sam(long mt, int cars, int[] ranks)
    {
        for(int i: ranks)
        {
            cars -= (long)Math.sqrt(mt/i);
            if(cars<=0) return true;
        }
        return false;
    }
    public long repairCars(int[] ranks, int cars) 
    {
        long l=1, r = Long.MAX_VALUE, m = 0, ans = -1;
        while(l<=r)
        {
            m = (l+r)/2;
            if(sam(m,cars,ranks)){
                ans = m;
                r = m-1;
            }
            else l= m+1;
        }
        return ans;
    }
}