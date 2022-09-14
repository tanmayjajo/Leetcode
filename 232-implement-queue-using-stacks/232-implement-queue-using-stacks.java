class MyQueue {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    
    public MyQueue() {
        
    }
    
    public void push(int x) {
        st1.add(x);
    }
    
    public int pop() {
        
        while(st1.size() > 1){
            st2.add(st1.pop());
        }
        
        int ans = st1.pop();
        
        while(st2.size() > 0){
            st1.add(st2.pop());
        }
        return ans;
    }
    
    public int peek() {
        while(st1.size() > 1){
            st2.add(st1.pop());
        }
        
        int ans = st1.peek();
        
        while(st2.size() > 0){
            st1.add(st2.pop());
        }
        return ans;
    }
    
    public boolean empty() {
        return (st1.isEmpty());
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