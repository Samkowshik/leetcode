class Solution {
    public int findChampion(int n, int[][] edges)
    {
        boolean[] f = new boolean[n];
        int c = n, s = (n*(n-1))/2;

        for(int[] i: edges)
        if(!f[i[1]]) 
        {
            f[i[1]] = true;
            s -= i[1];
            c--;
        }

        return c == 1? s: -1;
    }
}