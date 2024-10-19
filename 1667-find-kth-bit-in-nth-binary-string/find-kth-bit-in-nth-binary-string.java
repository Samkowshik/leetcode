class Solution 
{
    public char findKthBit(int n, int k) 
    {
        if(n == 1) return '0';

        int x = (int)Math.pow(2,n-1);

        if(k == x)return '1';

        if(k < x) return findKthBit(n-1, k);

        if(k > x) return findKthBit(n-1, 2*x-k) == '0' ?'1':'0';

        return '-';
    }
}