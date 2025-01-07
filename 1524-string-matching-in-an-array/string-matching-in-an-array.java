class Solution 
{
    public List<String> stringMatching(String[] words) 
    {
        int n = words.length;
        List<String> lst = new ArrayList<>();
        for(int i=0; i<n; i++)
        for(int j=0; j<n; j++)
        if(i!=j)
        {
            if(words[j].contains(words[i]))
            {
                lst.add(words[i]);
                break;
            }
        }

        return lst;
    }
}