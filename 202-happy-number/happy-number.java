class Solution 
{
    public boolean isHappy(int n) 
    {
        Set<Integer> set = new HashSet<>();
        while(set.add(n))
        {
            int hn = 0;
            while(n>0){
                int r = n%10;
                hn += r*r;
                n /= 10;
            }
            n = hn;
        }
        return set.contains(1);
    }
}