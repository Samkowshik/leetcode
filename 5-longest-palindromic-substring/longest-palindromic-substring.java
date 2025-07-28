class Solution 
{
    public String longestPalindrome(String s) 
    {
        int n = s.length(), start = 0, end = 1;
        boolean[][] map = new boolean[n][n];

        map[0][0] = true;

        for(int i=1; i<n; i++){
            map[i][i] = true;
            map[i-1][i] = s.charAt(i-1) == s.charAt(i);

            if(map[i-1][i]){
                start = i-1;
                end = i+1;
            }
        }

        for(int i=2; i<n; i++)
        for(int j=0; j<n-i; j++)
        {
            map[j][j+i] = map[j+1][j+i-1] && s.charAt(j) == s.charAt(j+i);

            if(map[j][j+i]){
                start = j;
                end = j+i+1;
            }
        }

        return s.substring(start, end);
    }
}