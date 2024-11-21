class Solution 
{
    public int maxVowels(String s, int k) 
    {
        char[] ca = s.toCharArray();
        String vowel = "aeiou";
        int c = 0;

        for(int i=0; i<k; i++)
        if(vowel.indexOf(ca[i])>-1)
        c++;

        int ans = c;
        for(int i=k; i<ca.length; i++)
        {
            if(vowel.indexOf(ca[i])>-1) c++;
            if(vowel.indexOf(ca[i-k])>-1) c--;

            ans = Math.max(ans,c);
        }


        return ans;
    }
}