class Solution 
{
    public int findMinArrowShots(int[][] points) 
    {
        Arrays.sort(points, (a,b) -> Integer.compare(a[0],b[0]));
        int n = points.length, ans = 0;

        for(int i=0; i<n;)
        {
            int max = points[i][1];
            
            while(i<n && points[i][0]<=max)
            {
                max = Math.min(max,points[i][1]);
                i++;
            }
            ans++;
        }

        return ans;
    }
}