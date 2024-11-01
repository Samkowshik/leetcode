class Solution {
    public int[] arrayRankTransform(int[] arr) 
    {
        int n = arr.length, c = 1;
        int[] ans = arr.clone();
        Arrays.sort(arr);

        Map<Integer, Integer> hm = new HashMap<>();
        int p = Integer.MIN_VALUE;

        for(int i=0; i<n; i++)
        {
            if(arr[i] == p) continue;
            p = arr[i];
            hm.put(p, c++);
        }

        for(int i=0; i<n; i++)
            ans[i] = hm.get(ans[i]);

        return ans;
    }
}