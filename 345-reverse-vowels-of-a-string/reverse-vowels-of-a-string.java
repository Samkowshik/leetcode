class Solution {
    public String reverseVowels(String s) 
    {
        String vowels = "AEIOUaeiou";

        char[] str = s.toCharArray();
        int i=0, j=str.length-1;

        while(i<j){

            while(i<j && !vowels.contains(str[i]+"")) i++;
            while(j>i && !vowels.contains(str[j]+"")) j--;
            if(i<j){
                str[i] = (char)(str[i] + str[j]);
                str[j] = (char)(str[i] - str[j]);
                str[i] = (char)(str[i] - str[j]);
            }
            i++; j--;
        }
        
        return new String(str);
    }
}