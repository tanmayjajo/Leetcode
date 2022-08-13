class MyStack {
    
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();
    
    public void push(int x) {
        queue1.offer(x);
    }
    
    public int pop() {
        while(queue1.size() > 1){
            queue2.offer(queue1.remove());
        }
        int ans = queue1.remove();
        while(!queue2.isEmpty()){
            queue1.add(queue2.remove());
        }
        return ans;
    }
    
    public int top() {
        while(queue1.size() > 1){
            queue2.offer(queue1.remove());
        }
        int ans = queue1.peek();
        queue2.offer(queue1.remove());
        while(!queue2.isEmpty()){
            queue1.add(queue2.remove());
        }
        return ans;
    }
    
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}
