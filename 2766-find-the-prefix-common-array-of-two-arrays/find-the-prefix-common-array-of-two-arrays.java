class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] map = new int[A.length+1];
        int[] ans = new int[A.length];
        int c = 0;
        for(int i=0; i<A.length; i++)
        {
            if(++map[A[i]-1] == 2)
                c++;
            if(++map[B[i]-1] == 2)
                c++;
            ans[i] = c;
        }

        return ans;
    }
}