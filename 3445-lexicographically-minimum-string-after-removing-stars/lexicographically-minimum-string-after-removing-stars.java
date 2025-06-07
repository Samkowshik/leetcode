class Pair
{
    char ch;
    int ind;
    Pair(char ch, int ind)
    {
        this.ch = ch;
        this.ind = ind;
    }
}
class MyComp implements Comparator<Pair>
{
    public int compare(Pair p1, Pair p2){
        if(p1.ch > p2.ch)
            return 1;
        if(p1.ch == p2.ch && p1.ind < p2.ind)
            return 1;
        return -1;
    }
}

class Solution 
{
    public String clearStars(String str) 
    {
        char[] s = str.toCharArray();
        int n = s.length;

        PriorityQueue<Pair> queue = new PriorityQueue<Pair>(new MyComp());
        for(int i=0; i<n; i++)
        {
            if(s[i] != '*') 
                queue.add(new Pair(s[i], i));
            else 
                s[queue.poll().ind] = '*';
        }


        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++)
            if(s[i] != '*')
                sb.append(s[i]);

        return sb.toString();
    }
}