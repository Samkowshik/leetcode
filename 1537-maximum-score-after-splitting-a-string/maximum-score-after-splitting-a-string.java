class Solution {
    public int maxScore(String s) 
    {
        char[] arr = s.toCharArray();
        int l =  arr.length, ones = 0;
        for(char i: arr)
            if(i=='1')
                ones++;
        int x = 0, y = 0, ans = 0;
        for(int i=0; i<l-1; i++)
        {
            if(arr[i]=='1') x++;
            else y++;
            ans = Math.max(ans,y+ones-x);
        }
        return ans;
    }
}