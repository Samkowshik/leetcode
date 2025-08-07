class Solution {
    public String mergeAlternately(String w1, String w2) 
    {
        int n = w1.length(), m = w2.length(), i = 0, j = 0;
        char[] ans = new char[n+m];

        for(int k=0; k<n+m; k++){
            if(i<n && (k%2 == 0 || j == m)) 
                ans[k] = w1.charAt(i++);
            else ans[k] = w2.charAt(j++);
        }

        return new String(ans);
    }
}