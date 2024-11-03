class Solution 
{
    static int findi(char[] str, char[] goal, int n)
    {
        for(int i=0; i<n; i++)
        {
            if(str[0] == goal[i])
            {
                int j=i;
                for(; j<n; j++)
                    if(str[j-i] != goal[j])
                        break;
                if(j==n) return i;
            }
        }
        return -1;
    }
    public boolean rotateString(String s, String g) 
    {
        char[] str = s.toCharArray();
        char[] goal =g.toCharArray();
        int n = str.length, m = goal.length;
        if(n!=m) return false;

        int ind = findi(str, goal, n);
        if(ind <0) return false;
        if(ind==0) return true;

        for(int i=0; i<ind; i++)
            if(goal[i] != str[n-ind+i])
                return false;

        return true;
    }
}