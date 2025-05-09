class Solution 
{
    public void setZeroes(int[][] mat) 
    {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int i=0; i<mat.length; i++)
        for(int j=0; j<mat[0].length; j++)
        if(mat[i][j]==0){
            s1.add(i);
            s2.add(j);
        }
        for(Integer i: s1)
        Arrays.fill(mat[i], 0);
        for(Integer i: s2)
        for(int j=0; j<mat.length; j++)
        mat[j][i] = 0;
    }
}