class Solution 
{
    int max, ans;
    int helper(int i, int sum, int[] cost, int[] maxArray)
    {
        if(i>=cost.length)
        {
            max = Math.max(max, sum);
            return 0;
        }
        return maxArray[i] = cost[i] + Math.max(helper(i*2+1, sum+cost[i], cost, maxArray), helper(i*2+2, sum+cost[i], cost, maxArray));
    }
    void sam(int i, int sum, int[] cost, int[] maxArray)
    {
        if(i>=cost.length) return;
        if(sum+maxArray[i] != max)
        {
            int x = max - sum - maxArray[i];
            ans += x;
            sum += x;
        } 
        sam(i*2+1, sum+cost[i], cost, maxArray);
        sam(i*2+2, sum+cost[i], cost, maxArray);
    }
    public int minIncrements(int n, int[] cost) 
    {
        max = 0; ans = 0;
        int[] maxArray = new int[n];
        helper(0, 0, cost, maxArray);
        sam(0, 0, cost, maxArray);
        return ans;
    }
}