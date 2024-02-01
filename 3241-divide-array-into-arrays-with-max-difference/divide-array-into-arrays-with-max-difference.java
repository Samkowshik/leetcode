class Solution {
    public int[][] divideArray(int[] arr, int k) 
    {
        int n = arr.length;
        Arrays.sort(arr);
        int[][] ans = new int[n/3][3];
        int[][] mt = {};
        for(int i=0; i<n; i+=3)
        {
            if(arr[i+2]-arr[i] > k) return mt;
            for(int j=0; j<3; j++)
            ans[i/3][j] = arr[i+j];
        }
        return ans;
    }
}