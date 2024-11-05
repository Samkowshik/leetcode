class Solution {
    public int minChanges(String s) 
    {
        int c = 0;
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i+=2)
            if(arr[i] != arr[i+1])
                c++;
        return c;
    }
}