class Solution 
{
    public int minCost(String colors, int[] neededTime)
    {
        int ans = 0, prv = colors.charAt(0), sum = 0, max = 0;
        for(int i=0; i<neededTime.length; i++)
        {
            if(prv == colors.charAt(i)){
                max = Math.max(max, neededTime[i]);
                sum += neededTime[i];
            }
            else{
                ans += sum-max;
                // System.out.println(ans+" "+i);
                max = neededTime[i];
                sum = neededTime[i];
            }
            prv = colors.charAt(i);
        }
        ans += sum-max;
        return ans;
    }
}