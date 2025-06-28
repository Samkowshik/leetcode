class Solution 
{
    int findLen(int x)
    {
        int l = 0;
        while(x>0){
            l++;
            x>>=1;
        }
        return l;
    }
    int findPos(int l, int x)
    {
        if(l%2==0) 
            return (1<<l)-x;
        return x+1-(1<<l-1);
    }
    int findVal(int l, int pos)
    {
        if(l%2==0) 
            return (1<<l)-pos;
        return pos-1+(1<<l-1);
    }
    public List<Integer> pathInZigZagTree(int x) 
    {
        List<Integer> ans = new LinkedList<>();

        ans.add(x);
        int len = findLen(x), pos = findPos(len, x);

        while(len>1)
        {
            len--;
            pos = (pos+1)/2;
            x = findVal(len, pos);
            ans.add(0,x);
        }
        return ans;
    }
}


