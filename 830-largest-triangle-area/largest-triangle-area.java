class Solution 
{
    public double largestTriangleArea(int[][] points) 
    {
        int n = points.length;
        double max = 0;
        for(int i=0; i<n-2; i++)
        for(int j=i+1; j<n-1; j++)
        for(int k=j+1; k<n; k++){
            double area = points[i][0]*(points[j][1]-points[k][1]);
            area += points[j][0]*(points[k][1]-points[i][1]);
            area += points[k][0]*(points[i][1]-points[j][1]);
            area = Math.abs(area);
            area /= 2;
            max = Math.max(max, area);
        }
        return max;
    }
}