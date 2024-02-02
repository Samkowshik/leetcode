class Solution 
{
    static int nxt(int low)
    {
        char[] arr = String.valueOf(low).toCharArray();
        int i=0, n =arr.length;
        int max = 0, m = 9,p=1;
        for(i=0; i<n; i++)
        {
            max = m*p+max;
            p*=10;
            m--;
        }
        if(low > max)
        {
            max = 0;
            for(i=1; i<=n+1; i++)
                max = max*10+i;
            return max;
        }
        for(i=1; i<n; i++)
        {
            int dif = arr[i]-arr[i-1];
            if(dif<=1) break;
            else if(dif > 1)
            {
                arr[i-1]+=1;
                break;
            }
        }
        if(i==n) return low;
        while(i<n)
        {
            arr[i] = (char)(arr[i-1]+1);
            i++;
        }
        max = 0;
        for(char j: arr)
        max = max*10+(j-'0');

        return max;
    }


    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        low = nxt(low);
        int hlp =0, tmp = low;
        while(tmp>0)
        {
            hlp= hlp*10+1;
            tmp/=10;
        }
        while(low<=high)
        {
            ans.add(low);
            low += hlp;
            if(low%10==0)
            {
                low = nxt(low);
                hlp = hlp*10+1;
            }
        }
        return ans;
    }
}