class pair
{
    int t, i;
    pair(int t, int i)
    {
        this.t = t;
        this.i = i;
    }
}


class Solution 
{
    public int[] dailyTemperatures(int[] arr) 
    {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<pair> st = new Stack<>();
        for(int i=n-1; i>=0; i--)
        {
            while(!st.empty() && st.peek().t <= arr[i])
            st.pop();

            ans[i] = st.empty()? 0: st.peek().i-i;
            st.push(new pair(arr[i],i));
        }
        return ans;
    }
}