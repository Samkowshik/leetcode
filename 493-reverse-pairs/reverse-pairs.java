class Solution 
{
    static int ans;
    static void fun(int[] arr, int l, int m, int h)
    {
        int i=l;
        for(int j=m+1; j<=h; j++)
        {
            while(i<=m && arr[i] <= 2* (long)arr[j]) i++;
            if(i>m) break;
            ans += m-i+1;
        }
    }
    static void merge(int[] arr, int l, int m, int h)
    {
        int n = h-l+1, i =l, j =m+1, k =0;
        int[] temp = new int[n];
        while(k<n)
        {
            if(j>h ||(i<=m && arr[i]<= arr[j]))
            {
                temp[k++] = arr[i];
                i++;
            }
            else
            {
                temp[k++] = arr[j];
                j++;
            }
        }
        for(int t=0; t<n; t++)
        arr[l+t] = temp[t];

    }
    static void mergesort(int[] arr, int l, int h)
    {
        if(l==h) return;
        int m = (l+h)/2;
        mergesort(arr,l,m);
        mergesort(arr,m+1,h);
        fun(arr,l,m,h);
        merge(arr,l,m,h);
    }
    public int reversePairs(int[] arr) 
    {
        ans = 0;
        mergesort(arr, 0, arr.length-1);
        return ans;
    }
}