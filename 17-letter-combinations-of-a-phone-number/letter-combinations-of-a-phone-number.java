class Solution
{
    static List<String> ans;
    static char[][] kp = {{'a', 'b', 'c'},{'d', 'e', 'f'},{'g', 'h', 'i'},{'j', 'k', 'l'},{'m', 'n', 'o'},{'p', 'q', 'r', 's'},{'t', 'u', 'v'},{'w', 'x', 'y', 'z'}};
    
    static void sam(String digits, int n, int i, char[] temp)
    {
        if(i==n) 
        {
            ans.add(new String(temp));
            return;
        }
        
        char[] x = kp[digits.charAt(i)-'2'];
        
        for(int j=0; j<x.length; j++)
        {
            temp[i] = x[j];
            sam(digits, n, i+1, temp);
        }
    }
    public List<String> letterCombinations(String digits) 
    {
        ans = new ArrayList<>();
        int n = digits.length();
        if(n==0) return ans;
        
        char[] temp = new char[n];
        sam(digits, n, 0, temp);

        return ans;
    }
}