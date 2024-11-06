class Solution 
{
    static boolean isSorted(int[] arr)
    {
        int p =0;
        for(int i: arr)
        {
            if(i<p) return false;
            p = i;
        }
        return true;
    }
    static int setc(int n)
    {
        int c =0;
        while(n>0)
        {
            if((n&1)==1) c++;
            n>>=1;
        }
        return c;
    }
    public boolean canSortArray(int[] arr)
    {
        int n = arr.length, i=0;
        while(i<n)
        {
            int c = setc(arr[i]), j = i;
            while(j<n && setc(arr[j])==c)
                j++;
            Arrays.sort(arr,i,j);
            i=j;
        }
        
        return isSorted(arr);
    }
}