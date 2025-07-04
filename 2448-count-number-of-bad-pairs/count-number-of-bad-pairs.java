import java.util.HashMap;

public class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int n = nums.length;
        long c = (long)n*(n-1)/2;
        for (int i=0; i<n; i++) {
            int key = nums[i]-i;
            c -= freq.getOrDefault(key,0);
            freq.put(key, freq.getOrDefault(key,0)+1);
        }
        return c;
    }
}