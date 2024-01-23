class Solution 
{
    static int l;
    static List<Integer> mylst(int n)
    {
        List<Integer> l = new ArrayList<>();
        int c =0;
        while(n>0)
        {
            if((n&1)==1)
                l.add(c);
            c++;
            n>>=1;
        }
        return l;
    }
    
    static void cmp(List<String> arr, List<Integer> lst)
    {
        int tl = 0;
        for(Integer i: lst) 
            tl+=arr.get(i).length();
        
        if(tl>l)
        {
            int[] hm = new int[26];
            for(Integer i: lst)
                for(char j : arr.get(i).toCharArray())
                    if(hm[j-'a']++ == 1) 
                        return;
            l = tl;
        }
    }
    public int maxLength(List<String> arr) 
    {
        l = 0;
        int f = (int)Math.pow(2,arr.size());
        
        while(f-->1)
            cmp(arr, mylst(f));
        return l;
    }
}