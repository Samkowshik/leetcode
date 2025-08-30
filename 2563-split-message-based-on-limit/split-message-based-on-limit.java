class Solution 
{
    int capacity(int n, int space)
    {
        int cap = 0, nine = 9;
        while(n >= nine){
            cap += nine*space;
            n -= nine;
            nine *= 10;
            space--;
            if(space == 0) return cap;
        }
        cap += n*space;
        return cap;
    }

    int binarySearch(int l, int r, int space, int len)
    {
        int m = 0, parts = -1;
        while(l<=r){
            m = (l+r)/2;

            if(capacity(m, space) >= len){
                parts = m;
                r = m-1;
            }
            else l = m+1;
        }

        return parts;
    }
    public String[] splitMessage(String message, int limit) 
    {
        int len = message.length(), l = 1, r = 9, m = 0, parts = 0;

        while(l<10000){
            parts = binarySearch(l, r, limit-4-Integer.toString(l).length(), len);
            if(parts != -1) break;
            l *= 10;
            r = Math.min(l*10-1, len);
        }

        if(parts == -1)
        return new String[]{};        

        // System.out.println(parts);

        String[] ans = new String[parts];
        int ind = 0, space = 0;
        for(int i=0; i<parts; i++){
            String s = "<"+(i+1)+"/"+parts+">";
            space = limit-s.length();
            ans[i] = message.substring(ind, Math.min(ind+space, len))+s;
            ind += space;
        }

        return ans;
    }
}