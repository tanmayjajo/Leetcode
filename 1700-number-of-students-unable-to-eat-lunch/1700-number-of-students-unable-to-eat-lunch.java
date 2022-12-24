class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();
        
        for(int i = sandwiches.length - 1; i >= 0; i--){
            st.add(sandwiches[i]);
        }
        
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < students.length; i++){
            queue.add(students[i]);
        }
        
        int count = 0;
        while(!queue.isEmpty()){
            
            
            if(queue.peek() == st.peek()){
                count = 0;
                st.pop();
                queue.poll();
            }else{
                queue.add(queue.poll());
                count++;
            }
            if(count==st.size()){
                break;
            }
        }
        
        return count;
    }
}