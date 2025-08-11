class Solution 
{
    int modPow(int sum)
    {
        int result = 1, mod = 1000000007;
        while(sum-->0)
        {
            result = (result << 1) % mod;
        }
        return result;
    }
    public int[] productQueries(int n, int[][] queries) 
    {
        int[] bits = new int[32];
        int ind = 0, c = 0;
        while(n>0){
            if((n&1) == 1) bits[ind++] = c;
            c++;
            n >>= 1;
        }


        
        int[] ans = new int[queries.length];
        for(int i=0; i<queries.length; i++)
        {
            int sum = 0;
            for(int j = queries[i][0]; j <= queries[i][1]; j++)
                sum += bits[j];

            ans[i] = modPow(sum);
        }
        return ans;
    }
}