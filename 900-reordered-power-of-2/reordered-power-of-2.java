class Solution 
{
    boolean compare(int a, int b)
    {
        int[] map = new int[10];
        while(a>0){
            map[a%10]++;
            a /= 10;
        }
        while(b>0){
            map[b%10]--;
            b /= 10;
        }
        for(int i: map)
            if(i != 0)
                return false;

        return true;
    }
    public boolean reorderedPowerOf2(int n) 
    {

        int m = 1, l = 1, len = (int) Math.log10(n)+1;
        while(l<=len)
        {
            if(l==len && compare(n,m)) return true;

            if(m == (1<<32)-1) return false;
            
            m <<= 1;
            l = (int) Math.log10(m)+1;
        }

        return false;
    }
}