class Solution {
    public long minEnd(int n, int x) 
    {
        n--;
        long ans = x, mask = 1;
        while(n>0)
        {
            if((ans & mask) == 0)
            {
                if((n&1) == 1)
                    ans |= mask;
                n>>=1;
            }
            mask<<=1;
        }
        return ans;
    }
}