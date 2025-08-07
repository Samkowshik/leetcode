class Solution {
    public String sortVowels(String s) 
    {
        String vowels = "AEIOUaeiou";

        char[] str = s.toCharArray();
        
        List<Character> lst = new ArrayList<>();
        for(char ch : str)
            if(vowels.contains(ch+""))
                lst.add(ch);

        Collections.sort(lst);

        int j = 0;
        for(int i=0; i<str.length; i++){
            if(vowels.contains(str[i]+""))
            str[i] = lst.get(j++);
        }
        
        return new String(str);
        
    }
}