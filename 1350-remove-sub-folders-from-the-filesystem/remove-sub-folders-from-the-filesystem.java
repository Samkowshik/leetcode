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
                if(a[j].startsWith(a[i]) && a[j].charAt(a[i].length())=='/')
                    a[j] = "";
                else 
                    break;
            }
            lst.add(a[i]);
        }

        return lst;
    }
}