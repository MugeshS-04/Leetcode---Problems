class MyStack {
    Queue<Integer> myq1;
    int size = 0;

    public MyStack() {
        myq1 = new LinkedList<>();
    }
    
    public void push(int x) {
        myq1.add(x);
        size++;
    }
    
    public int pop() {
        int temp_size = size;

        while(temp_size != 1)
        {
            int temp = myq1.poll();
            myq1.add(temp);
            temp_size--;
        }

        size--;
        return myq1.poll();
    }
    
    public int top() {
        int temp_size = size;
        int temp = 0;

        while(temp_size != 0)
        {
            temp = myq1.poll();
            myq1.add(temp);
            temp_size--;
        }

        return temp;
    }
    
    public boolean empty() {
        return myq1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */