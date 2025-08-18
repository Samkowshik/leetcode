class Solution {
    public long calculateScore(String s) 
    {
        Stack<Integer>[] arr = new Stack[26];

        for(int i=0; i<26; i++)
        arr[i] = new Stack<>();

        long ans = 0;
        for(int i=0; i<s.length(); i++)
        {
            int ind = s.charAt(i)-'a', mind = 25-ind;

            if(arr[mind].size() != 0)
                ans += i-arr[mind].pop();
            else
            arr[ind].push(i);

        }

        return ans;
    }
}