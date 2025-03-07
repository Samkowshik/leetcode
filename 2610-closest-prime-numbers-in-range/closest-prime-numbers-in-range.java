class Solution 
{
    static int next(int i, boolean[] primes)
    {

        for(;i<primes.length;i++)
            if(!primes[i])
                return i;
        return Integer.MAX_VALUE;
    }

    static void seive(boolean[] primes)
    {
        primes[1] = true;
        int l = primes.length;
        for(int i=2; i*i<l; i++)
            if(!primes[i])
                for(int j = i*i; j<l; j+=i)
                    primes[j] = true;
    }

    public int[] closestPrimes(int left, int right) 
    {
        boolean[] primes = new boolean[right+1];
        seive(primes);

        int j = 0, x = -1, y = -1, min = right;
        for(int i=next(left, primes); i<right; i=j){
            j = next(i+1, primes);
            if(j-i < min){
                x=i;
                y=j;
                min = j-i;
            }
        }
        return new int[]{x,y};
    }
}