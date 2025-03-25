class Solution 
{
    public boolean checkValidCuts(int n, int[][] rects) 
    {
        Arrays.sort(rects, (a,b) -> Integer.compare(a[0],b[0]));

        int c=2, end = rects[0][2];
        for(int[] rect: rects)
        {
            if(rect[0]>=end)
                c--;
            if(c==0) return true;
            end = Math.max(end, rect[2]);
        }

        Arrays.sort(rects, (a,b) -> Integer.compare(a[1],b[1]));
        
        c=2; end = rects[0][3];
        for(int[] rect: rects)
        {
            if(rect[1]>=end)
                c--;
            if(c==0) return true;
            end = Math.max(end, rect[3]);
        }
        return false;
    }
}