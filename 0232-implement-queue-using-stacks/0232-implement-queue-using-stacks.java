class MyQueue {
    Stack<Integer> first;
    Stack<Integer> second;

    public MyQueue() {
        first = new Stack();
        second = new Stack();
    }
    
    public void push(int x) {
        first.push(x);
    }
    
    public int pop() {
        while(!first.isEmpty())
        {
            second.push(first.pop());
        }

        int val = second.pop();

        while(!second.isEmpty())
        {
            first.push(second.pop());
        }

        return val;
    }
    
    public int peek() {

        while(!first.isEmpty())
        {
            second.push(first.pop());
        }

        int val = second.peek();

        while(!second.isEmpty())
        {
            first.push(second.pop());
        }

        return val;
    }
    
    public boolean empty() {
        return first.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */