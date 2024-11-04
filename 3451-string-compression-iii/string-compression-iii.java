class Solution {
    public String compressedString(String word) 
    {
        StringBuilder ans = new StringBuilder();
        int c = 0;
        char p = word.charAt(0);
        for(char ch : word.toCharArray())
        {
            if(ch == p) c++;
            else
            {
                ans.append(c);
                ans.append(p);
                c = 1;
            }
            if(c==10)
            {
                ans.append(9);
                ans.append(p);
                c = 1;
            }
            p = ch;
        }
        ans.append(c);
        ans.append(p);
        return ans.toString();
    }
}