class StockSpanner
{
    ArrayDeque<int[]> stack;
    public StockSpanner() 
    {
        stack = new ArrayDeque<>();
    }
    
    public int next(int price) 
    {
        int prices;
        int span = 1;
        
        while(!stack.isEmpty() && stack.peek()[0] <= price)
        {
            span = span + stack.pop()[1];
        }
        stack.push(new int[]{price , span}); //when stack is empty  , this will run

        return span;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */