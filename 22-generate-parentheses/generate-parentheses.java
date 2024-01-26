class Solution 
{
    static List<String> ans; 
    static void fun(int oc, int cc, int n, char[] temp)
    {
        int p = oc+cc;
        if(p == n*2)
        {
            ans.add(new String(temp));
            return;
        }
        if(oc<n)
        {
            temp[p] = '(';
            fun(oc+1,cc,n,temp);
            temp[p] = '\u0000';
        }
        if(oc>cc)
        {
            temp[p] = ')';
            fun(oc,cc+1,n,temp);
        }
    }
    public List<String> generateParenthesis(int n) 
    {
        ans = new ArrayList();
        char[] temp = new char[n*2];
        temp[0] = '(';
        fun(1,0,n,temp);
        // System.out.println(Arrays.toString(temp));
        return ans;
    }
}