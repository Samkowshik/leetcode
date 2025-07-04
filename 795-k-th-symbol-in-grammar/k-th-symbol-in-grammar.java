class Solution 
{
    public int kthGrammar(int n, int k) 
    {
        if(n==1) return 0;

        int ans = kthGrammar(n-1, (k+1)/2);
        
        if(ans == 1){
            if(k%2==1) return 1;
            return 0;
        }
        else{
            if(k%2==1) return 0;
            return 1;
        }
    }
}