

class Solution 
{
    public int[][] sortTheStudents(int[][] score, int k) 
    {
        Arrays.sort(score, (arr1, arr2) -> Integer.compare(arr2[k], arr1[k]));

        return score;
    }
}