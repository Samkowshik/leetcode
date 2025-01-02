class Solution {
    public int findTheWinner(int n, int k) 
    {
        if(n==1) return 1;
        int x = (k+findTheWinner(n-1, k))%n;
        return x==0? n:x;
    }
}