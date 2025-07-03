class Solution {
    public String shiftingLetters(String str, int[] shifts) 
    {
        int n = shifts.length-1;
        shifts[n] %= 26;
        for(int i=n-1; i>=0; i--)
            shifts[i] = (shifts[i]+shifts[i+1])%26;

        char[] s = str.toCharArray();
        for(int i=0; i<=n; i++)
        {
            int j = s[i]+shifts[i];
            if(j>'z') j -= 26;
            s[i] = (char)j;
        }
        return new String(s);
    }
}