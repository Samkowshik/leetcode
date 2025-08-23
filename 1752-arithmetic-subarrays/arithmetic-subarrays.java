class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        
        List<Boolean> lst = new ArrayList<>();

        for(int i=0; i<l.length; i++)
        {
            int[] arr = Arrays.copyOfRange(nums,l[i],r[i]+1);
            Arrays.sort(arr);
            
            int dif = arr[1] - arr[0];
            boolean f = true;
            for(int j=1; f && j<arr.length; j++)
            if(arr[j]-arr[j-1] != dif)
                f = false;

            lst.add(f);
        }

        return lst;
    }
}