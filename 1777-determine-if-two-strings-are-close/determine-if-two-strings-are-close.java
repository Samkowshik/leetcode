class Solution {
    public boolean closeStrings(String x, String y)
    {
        int[] a = new int[26];
        int[] b = new int[26];
        int n=x.length();
        int m=y.length();
        if(n!=m) return false;
        for(int i=0; i<n; i++) a[x.charAt(i)-'a']++;
        for(int i=0; i<m; i++) b[y.charAt(i)-'a']++;
        for(int i=0; i<26; i++)
            if((a[i]==0 && b[i]!=0) || (a[i]!=0 && b[i]==0)) 
                return false;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0; i<26; i++)
            if(a[i]!=b[i])
                return false;
        return true;
    }
}