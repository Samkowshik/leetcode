class Solution 
{
    public int numberOfAlternatingGroups(int[] colors, int k) 
    {
        int n = colors.length, i=1;
        while(i<n && (colors[i-1]^colors[i])==1) i++;
        if(i==n){
            if(n%2==0) 
                return n;
            return n-k+1;
        }
    
        int ans = 0, pre = i;
        System.out.println(pre);
        while(i<n){
            int j = i;
            while(i<n-1 && (colors[i]^colors[i+1])==1) i++;
            // System.out.println(j+" "+i+" "+n);
            if(i==n-1){
                if((colors[0]^colors[n-1])==1){
                    if(i-j+1+pre >= k)
                        ans += i-j+1+pre-k+1;
                }
                else{
                    if(i-j+1 >= k)
                        ans += i-j+1-k+1;
                    if(pre >= k)
                        ans += pre-k+1;
                }
            }
            else if(i-j+1 >= k)
                ans += i-j+1-k+1;
            i++;
        }
        return ans;
    }
}