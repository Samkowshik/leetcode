class Solution 
{
    boolean isValid(long n)
    {
        long prvBit = n&1, curBit = 0;
        n>>=1;

        while(n!=0){
            curBit = n&1;
            if(prvBit+curBit == 0)
                return false;

            prvBit = curBit;
            n>>=1;
        }

        return true;
    }

    public List<String> validStrings(int n) 
    {
        List<String> ans = new ArrayList<>();
        if(n==1){
            ans.add("0");
            ans.add("1");
            return ans;
        }
        
        long start = 1<<(n-2), end = 1<<n;
        for(long i=start; i<end; i++)
        {
            if(isValid(i)){
                String str = Long.toBinaryString(i);
                if(str.length() <n)
                    str = "0"+str;
                ans.add(str);
            }
        }
        return ans;
    }
}