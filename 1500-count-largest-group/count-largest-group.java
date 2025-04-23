class Solution 
{
    static int sum(int n)
    {
        int sum = 0;
        while(n!=0){
            sum+= n%10;
            n/=10;
        }
        return sum;
    }
    public int countLargestGroup(int n)
    {
        int[] map = new int[50];
        int max = 0, size = 0;
        for(int i=1; i<=n; i++)
        {
            int sum = sum(i);
            map[sum]++;

            if(map[sum]>max) 
            {
                max = map[sum];
                size=1;
            }
            else if(map[sum]==max) size++;
        }
        return size;
        
    }
}