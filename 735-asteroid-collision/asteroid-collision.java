class Solution 
{
    public int[] asteroidCollision(int[] nums) 
    {
        Stack<Integer> stack = new Stack<>();
        for(Integer ele: nums)
        {
            if(stack.empty() || stack.peek()<0 || ele>0)
                stack.push(ele);
            else{
                while(!stack.empty() &&  stack.peek()>0 && stack.peek()<-ele)
                    stack.pop();

                if(stack.empty() || stack.peek()<0) 
                    stack.push(ele);
                else if(stack.peek() == -ele) 
                    stack.pop();
            }
        }

        int[] ans = new int[stack.size()];
        int i = 0;
        for(Integer ele: stack)
        ans[i++] = ele;

        return ans;
    }
}