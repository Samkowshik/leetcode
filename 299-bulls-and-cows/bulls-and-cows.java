class Solution 
{
    public String getHint(String secret, String guess) 
    {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int n = secret.length(), a = 0, b = 0;

        for(int i=0; i<n; i++)
            if(secret.charAt(i) == guess.charAt(i))
                a++;
            else{
                arr1[secret.charAt(i)-'0']++;
                arr2[guess.charAt(i)-'0']++;
            }

        for(int i=0; i<10; i++)
            b+=Math.min(arr1[i], arr2[i]);

        return a+"A"+b+"B";
    }
}