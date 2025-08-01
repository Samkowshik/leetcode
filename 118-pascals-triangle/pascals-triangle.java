class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        one.add(1);
        ans.add(one);

        int[][] mat = new int[n][];
        for(int i=1; i<n; i++){
            List<Integer> lst = new ArrayList<>();
            lst.add(1);
            for(int j=1; j<i; j++)
            lst.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
            lst.add(1);

            ans.add(lst);
        }
        
        return ans;
    }
}