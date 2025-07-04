class Solution 
{
    int findMsb(long n)
    {
        int c = 0;
        while(n>0){
            n>>=1;
            c++;
        }
        return c;
    }
    public char kthCharacter(long k, int[] operations) 
    {
        if(k==1) return 'a';

        boolean bool = operations[findMsb(k-1)-1] == 1;

        long msb = Long.highestOneBit(k);
        if(msb==k) k/=2;
        else k-=msb;

        char ans =  kthCharacter(k, operations);

        if(bool)
        ans = ans == 'z'? 'a':(char)(ans+1);

        return ans;
    }
}