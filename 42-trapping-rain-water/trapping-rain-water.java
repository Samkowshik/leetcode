class Solution {
    public int trap(int[] height) 
    {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        int lmax = 0, rmax = 0;
        for(int i=0; i<n; i++){
            left[i] = lmax;
            lmax = Math.max(lmax, height[i]);

            right[n-i-1] = rmax;
            rmax = Math.max(rmax, height[n-i-1]);
        }

        int ans = 0;
        for(int i=0; i<n; i++){
            int val = Math.min(left[i], right[i]) - height[i];
            if(val > 0) ans+= val;
        }
        return ans;
    }
}