class Solution 
{
    static int sam(int[] arr, long t)
    {
        int n = arr.length,  l = 0, r = n-1, m = 0, i = n;
        while(l<=r)
        {
            m = (l+r)/2;
            if(arr[m]>=t){
                i = m;
                r = m-1;
            }
            else l = m+1;
        }
        return n-i;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success)
    {
        Arrays.sort(potions);
        int n = spells.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++)
        {
            long t = success/spells[i] + (success%spells[i]!=0?1:0);
            ans[i] = sam(potions, t);
        } 
        return ans;
    }
}