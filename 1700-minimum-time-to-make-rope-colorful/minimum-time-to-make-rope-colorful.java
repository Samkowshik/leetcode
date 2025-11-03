class Solution 
{
    public int minCost(String colors, int[] neededTime)
    {
        int ans = 0, sum = neededTime[0], max = sum;
        for(int i=1; i<neededTime.length; i++)
        {
            if(colors.charAt(i-1) == colors.charAt(i)){
                max = Math.max(max, neededTime[i]);
                sum += neededTime[i];
            }
            else{
                ans += sum-max;
                // System.out.println(ans+" "+i);
                max = neededTime[i];
                sum = neededTime[i];
            }
        }
        ans += sum-max;
        return ans;
    }
}