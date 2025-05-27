class Solution 
{
    public int differenceOfSums(int n, int m) 
    {
        int s1 = (n*(n+1))/2;
        int t = n/m;
        return s1-m*t*(t+1);
    }
}