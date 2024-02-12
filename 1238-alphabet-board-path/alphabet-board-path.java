class Solution 
{
    static String sam(int i, int j)
    {
        int rd = Math.abs(j/5 - i/5), c1= i%5, c2=j%5, cd= Math.abs(c1-c2);
        String ans ="";
        if(i==25)
        {
            while(rd-->0) ans+="U";
            while(cd-->0) ans+="R";
            return ans+"!";
        }
        if(c2>c1) while(cd-->0) ans+="R";
        while(cd-->0) ans+="L";

        if(i>j) while(rd-->0) ans+="U";
        while(rd-->0) ans+="D";

        return ans+"!";
    }

    public String alphabetBoardPath(String target) 
    {
        char[] arr = target.toCharArray();

        StringBuilder ans = new StringBuilder();
        ans.append(sam(0,arr[0]-'a'));
        for(int i=0; i<arr.length-1; i++)
        {
            ans.append(sam(arr[i]-'a', arr[i+1]-'a'));
        }
        return ans.toString();
    }
}