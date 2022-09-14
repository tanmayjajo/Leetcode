class MyStack {
    
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();
    
    public MyStack() {
        
    }
    
    public void push(int x) {
        queue1.add(x);
    }
    
    public int pop() {
        
        while(queue1.size() > 1){
            queue2.add(queue1.poll());
        }
        
        int ans = queue1.poll();
        
        while(queue2.size() > 0){
            queue1.add(queue2.poll());
        }
        return ans;
    }
    
    public int top() {
        while(queue1.size() > 1){
            queue2.add(queue1.poll());
        }
        
        int ans = queue1.peek();
        queue2.add(queue1.poll());
        while(queue2.size() > 0){
            queue1.add(queue2.poll());
        }
        return ans;
    }
    
    public boolean empty() {
        return queue1.isEmpty();
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