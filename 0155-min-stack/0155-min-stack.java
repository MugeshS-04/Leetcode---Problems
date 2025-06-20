class MinStack {

    Stack <Integer> mystack = new Stack();
    Stack <Integer> minstack = new Stack();

    public MinStack() {

    }
    
    public void push(int val) {
        mystack.push(val);
        if(minstack.isEmpty() || minstack.peek() >= val)
        {
            minstack.push(val);
        }
    }
    
    public void pop() {
        int popped = mystack.pop();
        if (!minstack.isEmpty() && popped == minstack.peek()) {
            minstack.pop();
        }
    }
    
    public int top() {
        return mystack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */