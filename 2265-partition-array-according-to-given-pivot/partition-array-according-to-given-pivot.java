class Solution {
    public int[] pivotArray(int[] nums, int pivot) 
    {
        int sml = 0, equ = 0;
        for(int i : nums)
            if(i < pivot) sml++;
            else if(i == pivot) equ++;

        int[] ans = new int[nums.length];
        int i=0, j=sml, k = sml+equ;
        for(int num : nums)
            if(num < pivot)
                ans[i++] = num;
            else if(num == pivot)
                ans[j++] = num;
            else
                ans[k++] = num;
        return ans;
    }
}