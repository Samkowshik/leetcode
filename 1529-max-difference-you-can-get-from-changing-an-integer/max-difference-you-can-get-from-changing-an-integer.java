class Solution 
{
    public int edit(int[] nums, int t, int r)
    {
        int ans = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]== t)
            ans = ans*10+r;
            else
            ans = ans*10+nums[i];
        }
        return ans;
    }
    public int maxDiff(int num) 
    {
        int dum = num, l = 0, i = 0;
        while(dum>0){
            dum /= 10;
            l++;
        }
        int[] nums = new int[l];
        dum = num; i = l-1;
        while(dum>0){
            nums[i--] = dum%10;
            dum /= 10;
        }

        i = 0;
        while(i<l && nums[i]==nums[0]) i++;
        if(i==l) 
            return 8*(int)(Math.pow(10,l)/9);
        // System.out.println(i);

        int n1 = 0, n2 = 0;

        i = 0;
        while(nums[i]==9) i++;
        n1 = edit(nums, nums[i], 9);

        if(nums[0]==1)
        {
            i = 0;
            while(i<l && (nums[i]==1 || nums[i]==0)) i++;

            if(i==l) return n1-num;
            
            n2 = edit(nums, nums[i], 0);
        }
        else
            n2 = edit(nums, nums[0], 1);

        System.out.println(n1+" "+n2);
        return n1-n2;
    }
}