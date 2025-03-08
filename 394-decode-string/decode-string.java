class Solution 
{
    public String decodeString(String str) 
    {
        StringBuilder sb = new StringBuilder();
        char[] s = str.toCharArray();
        for(int i=0; i<s.length; )
        {
            if(s[i]>='a' && s[i]<='z')
            {
                int j = i;
                while(i<s.length && s[i]>='a' && s[i]<='z') i++;
                // System.out.println(str.substring(j,i));
                sb.append(str.substring(j,i));
            }
            if(i<s.length && s[i]>='0' && s[i]<='9')
            {
                int j = i, val = 0, sqb = 1;
                while(i<s.length && s[i]>='0' && s[i]<='9') i++;
                val = Integer.parseInt(str.substring(j,i));
                // System.out.println(val);

                i++; j = i;
                while(sqb>0){
                    if(s[i]=='[') sqb++;
                    else if(s[i]==']') sqb--;
                    i++;
                }
                // System.out.println(str.substring(j,i-1));
                String minor = decodeString(str.substring(j,i-1));
                while(val-->0)
                sb.append(minor);
            }
        }
        return sb.toString();
    }
}