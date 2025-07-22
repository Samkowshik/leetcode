class Solution {
    public int minimumCardPickup(int[] cards) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i=0; i<cards.length; i++)
        {
            Integer ind = map.get(cards[i]);
            if(ind != null)
                min = Math.min(min, i-ind+1);
            map.put(cards[i], i);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}