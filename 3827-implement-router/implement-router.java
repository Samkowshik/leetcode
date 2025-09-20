class Router 
{
    Queue<int[]> que;
    Map<Integer, List<Integer>> map;
    Set<String> set;
    int memoryLimit;

    int binarySearch(List<Integer> lst, int target)
    {
        if(lst.getLast() < target) return lst.size();

        int l = 0, r = lst.size()-1, m = 0, ans = 0;
        while(l<=r){
            m = (l+r)/2;
            if(lst.get(m) >= target){
                ans = m;
                r = m-1;
            }
            else
            l = m+1;
        }
        return ans;
    }
    public Router(int memoryLimit) 
    {
        this.memoryLimit = memoryLimit;
        que = new LinkedList<>();
        map = new HashMap<>();
        set = new HashSet<>();
    }
    
    public boolean addPacket(int source, int destination, int timestamp) 
    {
        String std = source +" "+ destination +" "+ timestamp;

        if(!set.add(std))
        return false;

        int[] packet = {source, destination, timestamp};
        que.add(packet);

        List<Integer> lst = map.getOrDefault(destination, new ArrayList<>());
        lst.add(timestamp);
        map.put(destination, lst);

        if(set.size() > memoryLimit)
            forwardPacket();
        
        // for(int[] e : que)
        // System.out.println(Arrays.toString(e));
        // System.out.println(set);
        // System.out.println(map);
        // System.out.println();

        return true;
    }
    
    public int[] forwardPacket() 
    {
        if(que.isEmpty())
            return new int[]{};
        
        int[] packet = que.poll();
        String std = packet[0] +" "+ packet[1]+" "+packet[2];
        set.remove(std);

        List<Integer> lst = map.get(packet[1]);
        lst.set(binarySearch(lst, 1), 0);
        map.put(packet[1], lst);

        return packet;
    }
    
    public int getCount(int destination, int startTime, int endTime) 
    {
        List<Integer> lst = map.get(destination);
        if(lst == null) return 0;
        // System.out.println(lst);
        int ind1 = binarySearch(lst, startTime), ind2 = binarySearch(lst, endTime+1);
        // System.out.println(ind1+" "+ind2);
        return ind2-ind1;        
    }
}

/**
 * Your Router object will be instantiated and called as such:
 * Router obj = new Router(memoryLimit);
 * boolean param_1 = obj.addPacket(source,destination,timestamp);
 * int[] param_2 = obj.forwardPacket();
 * int param_3 = obj.getCount(destination,startTime,endTime);
 */