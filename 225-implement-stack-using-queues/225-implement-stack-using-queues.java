class MyStack {
    
    Queue<Integer> q = new LinkedList<>();
    
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        int size = q.size();
        while(size-->1){
            q.add(q.poll());
        }
        return q.poll();
    }
    
    public int top() {
        int size = q.size();
        while(size-->1){
            q.add(q.poll());
        }
        int ans = q.poll();
        q.add(ans);
        return ans;
    }
    
    public boolean empty() {
        return q.isEmpty();
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