class Solution 
{
    static List<Integer> lst;
    static void sam(int[][] mat, int m1, int n1, int m2, int n2)
    {
        if(m1 > m2 || n1 > n2) return;
        for(int i=n1; i<=n2; i++)
            lst.add(mat[m1][i]);
        for(int i=m1+1; i<=m2; i++)
            lst.add(mat[i][n2]);

        if(m1 != m2)
        for(int i=n2-1; i>n1; i--)
            lst.add(mat[m2][i]);
            
        if(n1 != n2)
        for(int i=m2; i>m1 ; i--)
            lst.add(mat[i][n1]);

        sam(mat, m1+1, n1+1, m2-1, n2-1);
    }
    public List<Integer> spiralOrder(int[][] mat) 
    {
        lst = new ArrayList<>();  
        sam(mat, 0, 0, mat.length-1, mat[0].length-1); 
        return lst;
    }
}