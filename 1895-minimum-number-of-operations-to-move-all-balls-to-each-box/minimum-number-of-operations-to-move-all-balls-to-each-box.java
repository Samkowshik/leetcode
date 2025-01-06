class Solution 
{
    public int[] minOperations(String boxess) 
    {
        char[] boxes = boxess.toCharArray();
        int n = boxes.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        int[] lft = new int[n];
        int[] rgt = new int[n];
        for(int i=n-2; i>=0; i--)
            lft[i] = lft[i+1] + (boxes[i+1] == '1'? 1:0);
        for(int i=n-2; i>=0; i--)
            pre[i] = pre[i+1] + (boxes[i+1] == '1'? i+1:0);
        
        for(int i=1; i<n; i++)
            rgt[i] = rgt[i-1] + (boxes[i-1] == '1'? 1:0);
        for(int i=1; i<n; i++)
            suf[i] = suf[i-1] + (boxes[i-1] == '1'? n-i:0);

            
        int[] ans = new int[n];
        for(int i=0; i<n; i++)
            ans[i] = pre[i] - i*lft[i] + suf[i] - (n-i-1)*rgt[i];

        return ans;
    }
}