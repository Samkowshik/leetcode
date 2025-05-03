class Solution
{
    public List<Boolean> kidsWithCandies(int[] candies, int k) 
    {
        int max = 0;
        for(int i : candies) max = Math.max(max, i);
        List<Boolean> lst = new ArrayList<>();
        for(int i : candies) lst.add(i+k>=max);
        return lst;
    }
}