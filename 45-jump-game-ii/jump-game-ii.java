class Solution {
    public int jump(int[] nums) 
    {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i=n-2; i>=0; i--)
        {
            if(nums[i] == 0) {   
                arr[i] = -1;
                continue;
            }

            int min = 1000000;
            for(int j = i+1; j<n && j-i<=nums[i]; j++)
                min = arr[j]<min && arr[j] != -1 ? arr[j] : min;

            arr[i] = min+1;
        }
        return arr[0];
    }
}