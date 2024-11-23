class Solution 
{
    public char[][] rotateTheBox(char[][] box) 
    {
        int n = box.length, m = box[0].length, c;
        char[][] ans = new char[m][n];

        for(char[] i: ans)
        Arrays.fill(i,'.');

        for(int i=0; i<n; i++)
        {
            c = 1;
            for(int j=0; j<m; j++)
            {
                if(box[i][j] == '#') c++;
                else if(box[i][j] == '*'){
                    while(c-->1)
                        ans[j-c][n-i-1] = '#';
                    ans[j][n-i-1] = '*';
                    c = 1;
                }
            }
            while(c-->1)
                ans[m-c][n-i-1] = '#';
        }

        return ans;
    }
}