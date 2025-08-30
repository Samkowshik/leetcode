class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int n = matrix[0].length, l = 0, r = matrix.length*n-1, mid = 0, row = 0, ele = 0;

        while(l<=r){
            mid = (l+r)/2;
            ele = matrix[mid/n][mid%n];

            if(ele < target)
            l = mid+1;
            else if(ele > target)
            r = mid-1;
            else
            return true;
        } 
        return false;        
    }
}