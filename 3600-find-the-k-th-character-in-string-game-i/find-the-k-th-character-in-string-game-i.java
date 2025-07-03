class Solution 
{
    public char kthCharacter(int k) 
    {
        if(k==1) return 'a';

        int msb = Integer.highestOneBit(k);
        if(msb==k) k/=2;
        else k-=msb;
        
        char ans =  kthCharacter(k);
        return ans == 'z'? 'a':(char)(ans+1);
    }
}