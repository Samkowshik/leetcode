class Solution 
{
    public List<String> removeSubfolders(String[] a) 
    {
        Arrays.sort(a);
        int n = a.length;

        List<String> lst = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            if(a[i].isEmpty()) continue;
            for(int j=i+1; j<n; j++)
            {
                if(a[j].startsWith(a[i]))
                {
                    int l1 = a[i].length(), l2 = a[j].length();
                    if(l1 == l2 || a[j].charAt(l1)=='/')
                    a[j] = "";
                }
                else break;
            }
            lst.add(a[i]);
        }
        
        // System.out.println(Arrays.toString(a));


        return lst;
    }
}