class Solution {
    public long flowerGame(int n, int m) 
    {
        long e1 = n/2, o1 = n-e1, e2 = m/2, o2 = m-e2;
        return e1*o2+e2*o1;
    }
}