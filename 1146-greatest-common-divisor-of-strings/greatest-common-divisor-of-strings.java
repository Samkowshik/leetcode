class Solution 
{
    static int sam(int n, int m, int l)
    {
        for(int i=l; i>0; i--)
            if(n%i==0 && m%i==0)
                return i;
        return 0;
    }
    public String gcdOfStrings(String str1, String str2) 
    {

        int n = str1.length(), m = str2.length();
        int l = sam(n,m,Math.min(n,m));

        while(l>0)
        {
            boolean f = true;
            for(int i=0; f && i<n; i+=l)
            {
                if(!str1.substring(0,l).equals(str1.substring(i,i+l)))
                    f = false;   
            }
            for(int i=0; f && i<m; i+=l)
            {
                if(!str1.substring(0,l).equals(str2.substring(i,i+l)))
                    f = false;      
            }
            if(f) return str1.substring(0,l);
            l = sam(n,m,l-1);
        }

        return "";
    }
}