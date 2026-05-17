class Node{
    int val;
    int min;
    Node next;
    Node(int val, int min, Node next){
        this.val = val;
        this.min = min;
        this.next = next;
    }
}
class MinStack {
    Node head;
    
    public MinStack() {
        this.head = null;
    }
    
    public void push(int val) {
        if(this.head == null){
            this.head = new Node(val, val, null);
        }else{
            int currentMin = Math.min(val, head.min);
            this.head = new Node(val, currentMin, head);
        }
    }
    
    public void pop() {
        this.head = this.head.next;
    }
    
    public int top() {
        return this.head.val;
    }
    
    public int getMin() {
        return this.head.min;
    }
}