class Solution 

{
    static boolean[] vis;
    static boolean sam(int[] arr, int n, int i)
    {
        if(i<0 || i>=n || vis[i]) return false;
        if(arr[i] == 0) return true;

        vis[i] = true;
        if(sam(arr,n, i-arr[i]) || sam(arr,n, i+arr[i]))
            return true;

        return false;
    }
    public boolean canReach(int[] arr, int start) 
    {
        int n = arr.length;
        vis = new boolean[n];
        return sam(arr, n,  start);
    }
}