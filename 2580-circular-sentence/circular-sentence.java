class Solution {
    public boolean isCircularSentence(String s) 
    {
        char[] arr = s.toCharArray();
        int n = arr.length;

        if(arr[0] != arr[n-1]) return false;

        for(int i=0; i<n; i++)
            if(arr[i] == ' ' && arr[i-1] != arr[i+1]) 
                return false;

        return true;
    }
}