class Solution 
{
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {
        int n = grid.length;
        n*=n;
        int[] arr = new int[n+1];
        int a = 0, sum = 0;
        for(int[] row : grid)
            for(int ele : row)
                if(arr[ele]++ == 1)
                    a = ele;
                else
                    sum += ele;
        return  new int[]{a,(n*(n+1))/2 - sum};
    }
}