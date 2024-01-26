class Solution 
{
    static List<List<Integer>> ans;
    static void fun(int i, int n, int[] nums, Stack<Integer> lst)
    {
        if(i==n)
        {
            ans.add(new ArrayList<>(lst));
            return;
        }
        fun(i+1,n,nums,lst);
        lst.push(nums[i]);
        fun(i+1,n,nums,lst);
        lst.pop();
    }
    public List<List<Integer>> subsets(int[] nums) 
    {
        ans = new ArrayList<>();
        Stack<Integer> lst = new Stack<>();
        fun(0,nums.length,nums,lst);
        return ans;
    }
}