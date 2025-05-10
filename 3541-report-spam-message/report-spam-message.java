class Solution 
{
    public boolean reportSpam(String[] message, String[] bannedWords) 
    {
        int c = 0;
        Set<String> set = new HashSet<>();
        for(String i: bannedWords)
            set.add(i);
        for(String i: message)
            if(set.contains(i) && ++c==2) 
                return true;
        
        return false;
    }
}