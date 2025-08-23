class Solution {
    public int longestContinuousSubstring(String s) {
        int max = 1, len = 1;
        for(int i=1; i<s.length(); i++){
            len = s.charAt(i)-s.charAt(i-1) == 1? len+1: 1;
            max = Math.max(max, len);
        }
        return max;
    }
}