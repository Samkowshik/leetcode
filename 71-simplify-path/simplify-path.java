class Solution 
{
    public String simplifyPath(String path) 
    {
        Stack<String> s = new Stack<>();
        String[] arr = path.split("/");

        for(String str : arr)
        {
            if(str.equals("") || str.equals(".")) continue;
            else if(str.equals(".."))
            {
                if(!s.empty()) 
                    s.pop();
            } 
            else s.add(str);
        }
        
        String ans = "";
        while(!s.empty())
            ans = "/"+ s.pop() + ans;

        // System.out.println(s);

        return ans.equals("")? "/" : ans;
    }
}