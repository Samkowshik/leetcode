class Solution 
{
    String spaces(int n)
    {
        String s = "";
        while(n-->0)
            s+=" ";
        return s;
    }
    String justify(String[] words, int start, int end, int max)
    {
        StringBuilder sb = new StringBuilder(words[start]);
        int space = max, gaps = end-start-1;

        for(int i=start; i<end; i++)
            space -= words[i].length();

        // System.out.println(space+" "+gaps);

        if(gaps == 0 || end == words.length){
            for(int i=start+1; i<end; i++)
                sb.append(" "+words[i]);
            sb.append(spaces(max-sb.length()));

            return sb.toString();
        }

        int quo = space/gaps, rem = space%gaps;

         for(int i=start+1; i<end; i++)
                sb.append(spaces(quo+(rem-->0?1:0))+words[i]);

        return sb.toString();
    }
    
    public List<String> fullJustify(String[] words, int maxWidth) 
    {
        List<String> ans = new ArrayList<>();

        int n = words.length, i = 0, j = 0, lineLength = -1;
        while(i<n){
            while(j<n && lineLength + words[j].length()+1 <= maxWidth){
                lineLength += words[j].length()+1;
                j++;
            }
            ans.add(justify(words, i, j, maxWidth));
            lineLength = -1;
            i = j;
        }

        return ans;
    }
}