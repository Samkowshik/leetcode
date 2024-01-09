class Solution
{
    static int msb(int n)
    {
        int c=0;
        while(n>0)
        {
            c++;
            n>>=1;
        }
        
        return c-1;
    }
    static int fun(int n, int m, int c)
    {
        System.out.println(n+" "+m+" "+c);
        int mask = 1<<msb(n);
        
        if(1<<msb(m)!= mask || (n&mask)!= mask || (m&mask)!=mask) return c;
        c+=mask;
        n^=mask;
        m^=mask;
        return fun(n,m,c);
    }
    public int rangeBitwiseAnd(int n, int m)
    {
        return fun(n,m,0);
    }
}