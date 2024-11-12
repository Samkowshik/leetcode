class Solution {
    public int compress(char[] chars) 
    {
        int len, dup, j =0, n = chars.length;
        for(int i=0; i<n; i++)
        {
            dup = i;
            while(i<n-1 && chars[i] == chars[i+1]) i++;
            len = i - dup +1;
            chars[j++] = chars[i];  
            if(len > 1)
            {
                for(char ch : (len+"").toCharArray())
                    chars[j++] = ch;  
            }
        }

        return j;
    }
}