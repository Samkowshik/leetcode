class Solution {
    public String makeFancyString(String s) 
    {
        char[] ans = new char[s.length()];
        int c = 0, j=0;
        char p = '-';
        for(char i: s.toCharArray())
        {
            c = i==p? c+1:1;
            if(c<3) ans[j++] = i;
            p = i;
        }

        return new String(ans,0,j);
    }
}