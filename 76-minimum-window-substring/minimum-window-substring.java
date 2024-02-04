class Solution
{
    public String minWindow(String S, String T) 
    {
        char[] s = S.toCharArray(), t = T.toCharArray(); 
        int n = s.length, c=0, c1=0, ans=n+1, p1=-1, p2=-1;
        
        int[] sfa = new int[58];
        int[] tfa = new int[58];
        for(char k: t)
        {
            int ind = k-'A';
            if(++tfa[ind]==1) c1++;
        }
        
        int i=0, j=0, ind = 0;
        while(i<n)
        {
            ind = s[i]-'A';
            if(++sfa[ind] == tfa[ind]) c++;
            while(c1==c)
            {
                if(i-j<ans)
                {
                    ans = i-j;
                    p1=j;
                    p2=i;
                }

                ind = s[j]-'A';
                if(--sfa[ind] < tfa[ind]) c--;
                j++;
            }
            i++;
        }

        if(p1==-1) return "";
        return S.substring(p1,p2+1);
    }
}