class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        String vow = "aeiouAEIOU";
        boolean f1 = false, f2 = false;
        for(char c : word.toCharArray()){
            if(c>='0' && c<='9') 
                continue;
            else if(vow.contains(c+"")) 
                f1 = true;
            else if((c>='a' && c<='z') || (c>='A' && c<='Z')) 
                f2 = true;
            else 
                return false;
        }
        return f1 && f2;
    }
}