class Solution {
    public boolean checkIfCanBreak(String s1, String s2) 
    {
        char[] arr1 = s1.toCharArray(), arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, n = arr1.length;
        while(i<n && arr1[i] == arr2[i]) i++;
        if(i==n) return true;

        if(arr1[i] < arr2[i]){
            while(i<n)
                if(arr1[i] > arr2[i++])
                    return false;
        }
        else{
            while(i<n)
                if(arr1[i] < arr2[i++])
                    return false;
        }

        return true;
    }
}