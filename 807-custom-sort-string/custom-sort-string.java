class Solution {
    public String customSortString(String order, String s) 
    {
        int[] map = new int[26];
        for(char ch : s.toCharArray())
            map[ch-'a']++;

        StringBuilder sb = new StringBuilder();
        for(char ch : order.toCharArray())
            while(map[ch-'a']-->0)
                sb.append(ch);
            
        for(int i=0; i<26; i++)
            while(map[i]-->0)
                sb.append((char)('a'+i));

        return sb.toString();
    }
}