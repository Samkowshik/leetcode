class Solution {
    public long maxMatrixSum(int[][] mat) 
    {
        boolean f = true,f1 = false;
        int min = 1000000, max =0;
        long sum = 0;
        for(int[] arr: mat)
        for(int i: arr)
        {
            if(i==0) f1 = true;
            else if(i<0){
                f = !f;
                i = -1*i;
            }
            min = Math.min(min, i);
            sum+=i;
        }
        if(min == 1000000 || f || f1) return sum;
        return sum-min*2;
    }
}