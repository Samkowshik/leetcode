
class Solution 
{
    public int countDays(int days, int[][] meetings)
    {
        Arrays.sort(meetings, (a,b) -> Integer.compare(a[0],b[0]));
        
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