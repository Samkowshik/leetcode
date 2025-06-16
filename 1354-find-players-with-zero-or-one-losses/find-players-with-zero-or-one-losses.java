class Solution {
    public List<List<Integer>> findWinners(int[][] matches) 
    {
        int[] lost = new int[100001];
        for(int[] match : matches)
            lost[match[1]]++;

        TreeSet <Integer> l1 = new TreeSet<>();
        TreeSet <Integer> l2 = new TreeSet<>();
        for(int[] match : matches)
        {
            if(lost[match[0]]==0)
                l1.add(match[0]);
            else if(lost[match[0]]==1)
                l2.add(match[0]);
            
            if(lost[match[1]]==0)
                l1.add(match[1]);
            else if(lost[match[1]]==1)
                l2.add(match[1]);
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(l1));
        ans.add(new ArrayList<>(l2));
        return ans;
    }
}