class Solution 
{
    public String predictPartyVictory(String senate) 
    {
        char[] s = senate.toCharArray();

        int n = s.length, ds = 0, rs = 0, nl = 0; 
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        if(s[i]=='D'){
            if(ds==0 && rs==0 || ds>0){
                ds++;
                arr[i] = 1;
                nl++;
            } 
            else{
                rs--;
                arr[i] = 0;
            }
        }
        else{
            if(ds==0 && rs==0 || rs>0){
                rs++;
                arr[i] = 1;
                nl++;
            } 
            else{
                ds--;
                arr[i] = 0;
            }
        }

        if(ds == n) return "Dire";
        if(rs == n) return "Radiant";
        
        for(int i=0; ds>0 && i<n; i++)
            if(s[i]=='R' && arr[i]==1){
                ds--; nl--;
                arr[i] = 0;
            }
        for(int i=0; rs>0 && i<n; i++)
            if(s[i]=='D' && arr[i]==1){
                rs--; nl--;
                arr[i] = 0;
            }
        
        int j = 0;
        char[] ns = new char[nl];
        for(int i=0; i<n; i++)
            if(arr[i]==1)
                ns[j++] = s[i];

        return predictPartyVictory(new String(ns));
    }
}