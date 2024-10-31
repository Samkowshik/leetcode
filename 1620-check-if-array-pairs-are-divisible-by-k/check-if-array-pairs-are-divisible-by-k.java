class Solution {
    public boolean canArrange(int[] arr, int k) 
    {
        int n = arr.length;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            arr[i] %= k;
            int e = arr[i], f = 1;

            if(e<0){
                e = -e;
                f = -1;
            }
            int c = hm.getOrDefault(e, 0);
            hm.put(e,c+f);
        }
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); 
        System.out.println(hm); 

        for(Integer i: hm.keySet())
        {
            if((i==0 || (k%2==0 && i==k/2)) && hm.get(i)%2 !=0) return false;

            if(i!=0 && hm.get(i) != 0 && hm.get(i) != hm.get(k-i)) return false;
        }
       
        return true;
    }
}