class Solution 
{
    public String longestPalindrome(String s) 
    {
        int n = s.length();
        String ans = s.charAt(0)+"";
        boolean[][] map = new boolean[n][n];

        map[0][0] = true;

        for(int i=1; i<n; i++){
            map[i][i] = true;
            map[i-1][i] = s.charAt(i-1) == s.charAt(i);

            if(map[i-1][i] && ans.length() == 1)
                ans = s.substring(i-1, i+1);
        }

        for(int i=2; i<n; i++)
        for(int j=0; j<n-i; j++)
        {
            map[j][j+i] = map[j+1][j+i-1] && s.charAt(j) == s.charAt(j+i);

            if(map[j][j+i] && ans.length() < i+1)
                ans = s.substring(j, j+i+1);
        }

        return ans;
    }
}