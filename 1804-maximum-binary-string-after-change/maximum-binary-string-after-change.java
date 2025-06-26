class Solution {
    public String maximumBinaryString(String binary)
    {
        char[] s = binary.toCharArray();
        int n = s.length, c = 0, i = 0;
        while(i<n && s[i]=='1') i++;
        if(i==n) return binary;
        
        while(i<n && s[i]=='0') i++;

        int p = i-1;
        for(; i<n; i++) if(s[i]=='0') c++;
        
        Arrays.fill(s, '1');
        s[p+c] = '0';
    
        return new String(s);
    }
}