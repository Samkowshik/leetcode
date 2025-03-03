class Pair
{
    int val, ind;
    Pair(int val, int ind){
        this.val = val;
        this.ind = ind;
    }

}
class StockSpanner 
{
    int i;
    Stack<Pair> stack;
    public StockSpanner() 
    {
        i = 0;
        stack = new Stack<>();
    }
    
    public int next(int price) 
    {
        int ans = 0;
        if(stack.empty() || stack.peek().val > price){
            ans = stack.empty()? i+1 : i-stack.peek().ind;
            stack.push(new Pair(price, i));
        }
        else{
            while(!stack.empty() && stack.peek().val <= price)
                stack.pop();
            ans = stack.empty()? i+1 : i-stack.peek().ind;
            stack.push(new Pair(price, i));
        }

        i++;
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */