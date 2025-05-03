class Solution 
{
    public boolean canPlaceFlowers(int[] arr, int n) 
    {
        int l = arr.length;
        if(n==0) return true;
        if(l==1) return arr[0]==0;
        if(l==2) return n==1 && arr[0]+arr[1]==0;

        if(arr[0]+arr[1]==0){
            arr[0] = 1;
            n--;
        }
        if(arr[l-1]+arr[l-2]==0){
            arr[l-1] = 1;
            n--;
        }
        for(int i=1; n>0 && i<arr.length-1; i++)
        {
            if(arr[i-1]+arr[i]+arr[i+1]==0){
                arr[i] = 1;
                n--;
            }
        }
        return n<=0;
    }
}