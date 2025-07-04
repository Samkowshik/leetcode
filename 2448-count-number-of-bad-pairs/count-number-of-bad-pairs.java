import java.util.HashMap;

public class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        long c = (long)n*(n-1)/2;
        for (int i=0; i<n; i++) {
            int key = nums[i]-i, val = map.getOrDefault(key,0);
            c -= val;
            map.put(key, val+1);
        }
        return c;
    }
}