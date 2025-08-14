class Solution {
    public String largestGoodInteger(String num) {
        int max = -1, ind = -1;
        for(int i=2; i<num.length(); i++){
            if(num.charAt(i)==num.charAt(i-1) && num.charAt(i)==num.charAt(i-2) && max < num.charAt(i)-'0'){
                max = num.charAt(i)-'0';
                ind = i;
            }
        }
        return ind == -1? "":num.substring(ind-2, ind+1);
    }
}