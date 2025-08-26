class Solution {
    public int areaOfMaxDiagonal(int[][] arr)
    {
        double d=0,md=0;
        int ma=0;
        for(int i=0; i<arr.length; i++)
        {
            int l = arr[i][0], b= arr[i][1];
            d = Math.sqrt(l*l+b*b);
            if (d>md){
                ma = l*b;
                md = d;
            }
            ma = d==md? Math.max(ma,l*b): ma;
        }
        return ma;
    }
}