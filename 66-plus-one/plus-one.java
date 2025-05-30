class Solution 
{
    static boolean all9(int[] digits)
    {
        for(int i: digits)
            if(i!=9)
                return false;
        return true;
    }
    public int[] plusOne(int[] digits) 
    {
        int n = digits.length;
        if(all9(digits))
        {
            int[] ans = new int[n+1];
            ans[0]++;
            return ans;
        }
        n--;
        while(digits[n]==9) digits[n--]=0;
        digits[n]++;
        return digits;
    }
}