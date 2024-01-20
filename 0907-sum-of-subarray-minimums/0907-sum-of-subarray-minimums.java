class Solution 
{
    static int n,mod= 1000000007;
    static int mini(int[] arr, int i, int j)
    {
        int m =30001,mi=0;
        for(int k =i; k<=j; k++)
        if(arr[k]<m)
        {
            m = arr[k];
            mi = k;
        }
        return mi;
    }
    static int help(int i, int j,int k)
    {
        k-=i;
        return((k+1)*(j-i+1-k))%mod;
    }
    static long fun(int[] arr, int i, int j)
    {
        if(j<0 || i==n || i>j) return 0;
        if(i==j) return (long)arr[i];
        int mi = mini(arr,i,j);
        long x = help(i,j,mi);
        return ((arr[mi]*x) + fun(arr, i, mi-1) + fun(arr, mi+1, j))%mod;
    }
    public int sumSubarrayMins(int[] arr) 
    {
        n = arr.length;
        return (int)fun(arr,0,n-1);
    }
}