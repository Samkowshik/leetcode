class MyComp implements Comparator<int[]>
{
    public int compare(int[] a, int[] b)
    {
        if(a[0]==b[0] && a[1]>b[1])
            return 1;
        if(a[0]>b[0])
            return 1;
        return -1;
    }
}
class Solution 
{
    public int countDays(int days, int[][] meetings)
    {
        Arrays.sort(meetings, new MyComp());
        
        int srt = meetings[0][0], end = meetings[0][1];

        int ans = srt - 1;
        for(int[] arr : meetings)
        {
            if(arr[0]>end)
                ans += arr[0]-end-1;
            end = Math.max(end,arr[1]);
        }
        ans += days-end;

        return ans;
    }
}