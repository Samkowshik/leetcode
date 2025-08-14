class Solution {
    public String largestOddNumber(String num) {
        
        for(int ind = num.length()-1; ind>=0; ind--)
        if((num.charAt(ind)-'0')%2 == 1)
        return num.substring(0, ind+1);
        
        return "";
    }
}