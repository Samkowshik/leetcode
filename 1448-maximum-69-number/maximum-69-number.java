class Solution 
{
    public int maximum69Number (int num) 
    {
        int val = num, ans = num, three = 3;
        while(val>0)
        {
            if(val%10 == 6)
            ans = num + three;

            val /= 10;
            three *= 10;
        }

        return ans;
    }
}