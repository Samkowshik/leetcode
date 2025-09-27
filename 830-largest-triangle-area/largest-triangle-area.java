class Solution 
{
    public double largestTriangleArea(int[][] points) 
    {
        double max = 0;
        for(int i=0; i<points.length-2; i++)
        for(int j=i+1; j<points.length-1; j++)
        for(int k=j+1; k<points.length; k++){
            double area = points[i][0]*(points[j][1]-points[k][1]) + points[j][0]*(points[k][1]-points[i][1]) + points[k][0]*(points[i][1]-points[j][1]);
            max = Math.max(max, Math.abs(area) / 2);
        }
        return max;
    }
}