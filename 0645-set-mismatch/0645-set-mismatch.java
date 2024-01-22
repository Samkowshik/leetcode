class Solution {
    public int[] findErrorNums(int[] nums) 
    {
        int n = nums.length, s=0;;
        int[] hm = new int[n];
        int x =0;
        for(int i: nums)
        {
            if(++hm[i-1]==2) {
                x= i;
            }
            s+=i;
        }
        System.out.println(s);
        int sum = (n*(n+1))/2;
        int[] ans = {x,sum-s+x};
        return ans;
    }
}