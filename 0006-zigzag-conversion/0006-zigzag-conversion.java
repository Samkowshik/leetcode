class Solution {
    public String convert(String s, int k) 
    {
        if (k==1) return s;
        int n = s.length();
        char[] arr = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        int x = (k-1)*2, a=x, b=0, c;

        for(int i=0; i<n; i+=x)
            ans.append(arr[i]);
        for(int j=1; j<k-1; j++)
        {
            a-=2;
            b+=2;
            c =b;
            for(int i=j; i<n; i+=c)
            {
                ans.append(arr[i]);
                c = c==a?b:a;
            }
        }
            
        for(int i=k-1; i<n; i+=x)
            ans.append(arr[i]);
        return ans.toString();
    }
}