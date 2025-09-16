class Solution 
{
    int findGcd(int a, int b)
    {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    void insert(Stack<Integer> stack, int x)
    {
        if(stack.isEmpty()){
            stack.add(x);
            return;
        }

        int gcd = findGcd(stack.peek(), x);

        if(gcd == 1)
            stack.add(x);
        else{
            int lcm = (int)((stack.pop()*(long)x)/gcd);
            insert(stack, lcm);
        }

    }
    public List<Integer> replaceNonCoprimes(int[] nums) 
    {
        Stack<Integer> stack = new Stack<>();
        
        for(int i : nums)
            insert(stack, i);

        return new ArrayList<>(stack);
    }
}