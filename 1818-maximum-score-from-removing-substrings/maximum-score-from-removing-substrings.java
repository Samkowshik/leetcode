class Solution 
{
    int sam(Stack<Character> s)
    {
        Stack<Character> st = new Stack<>();
        int ans=0;
        while(!s.isEmpty()){
            char c = s.pop();
            if(st.isEmpty() || st.peek() == c)
            st.add(c);
            else{
                ans++;
                st.pop();
            }
        }
        return ans;
    }
    public int maximumGain(String s, int x, int y) 
    {
        int ans = 0;
        boolean f = x>=y;
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray())
        {
            if(c == 'a'){
                if(st.isEmpty() || st.peek() == 'a' || f)
                    st.add(c);
                else{
                    ans += y;
                    st.pop();
                }
            }
            else if(c == 'b'){
                if(st.isEmpty() || st.peek() == 'b' || !f)
                    st.add(c);
                else{
                    ans += x;
                    st.pop();
                }
            }
            else if(!st.isEmpty()){
                ans += sam(st)*Math.min(x,y);
            }
        }
        ans += sam(st)*Math.min(x,y);
        return ans;
    }
}