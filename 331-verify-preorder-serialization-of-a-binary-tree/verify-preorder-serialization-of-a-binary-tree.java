class Solution 
{
    public boolean isValidSerialization(String preorder) 
    {
        if(preorder.equals("#")) return true;
        Stack<Integer> stack = new Stack<>();

        String[] strs = preorder.split(",");

        for(int i=0; i<strs.length; i++)
        {
            if(!strs[i].equals("#"))
                stack.add(2);
            else{

                while(!stack.isEmpty() && stack.peek()==1)
                    stack.pop();

                if(!stack.isEmpty()) stack.add(stack.pop()-1);

                if(i!=strs.length-1 && stack.isEmpty()) return false;
                // System.out.println(stack);
            }
        }

        return stack.isEmpty();
    }
}