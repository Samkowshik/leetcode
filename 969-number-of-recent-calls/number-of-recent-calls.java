class RecentCounter 
{
    Queue<Integer> que; 
    public RecentCounter() 
    {
        que = new LinkedList<>();
    }
    
    public int ping(int t) 
    {
        while(!que.isEmpty() && que.peek() < t-3000) que.poll();
        que.add(t);
        return que.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */