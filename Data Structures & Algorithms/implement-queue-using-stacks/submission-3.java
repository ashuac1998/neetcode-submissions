class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public MyQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }
    
    public void push(int x) {
        this.stack2.push(x);
    }
    
    public int pop() {
        while(this.stack2.size() > 0){
            int x = this.stack2.pop();
            this.stack1.push(x);
        }
        int res = this.stack1.pop();
        while(this.stack1.size() > 0){
            int x = this.stack1.pop();
            this.stack2.push(x);
        }
        return res;
    }
    
    public int peek() {
        while(this.stack2.size() > 0){
            int x = this.stack2.pop();
            this.stack1.push(x);
        }
        int res = this.stack1.peek();
        while(this.stack1.size() > 0){
            int x = this.stack1.pop();
            this.stack2.push(x);
        }
        return res;
    }
    
    public boolean empty() {
        return this.stack1.size() == 0 && this.stack2.size() == 0;
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