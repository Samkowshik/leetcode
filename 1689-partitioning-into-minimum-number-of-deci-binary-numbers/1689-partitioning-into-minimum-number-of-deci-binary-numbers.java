class Solution {
    public int minPartitions(String n)
    {
        char max = '0';
        for(char i: n.toCharArray())
            max = (char)Math.max(max,i);
        return max-'0';
    }
}