class MinStack {
    
    /** initialize your data structure here. */
    private Stack<Integer> stack = new Stack<>();
    int min = Integer.MAX_VALUE;
    public MinStack() {
        
    }
    
    public void push(int x) {
         if(x <= min) {          
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }
    
    public void pop() {
        if(stack.pop() == min) {
            min=stack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}