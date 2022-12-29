class Solution {
    public int[] getOrder(int[][] tasks) {
        // Arrays of Task Objects, Task class is created below
        Task[] arr = new Task[tasks.length];
        //filling arr with all the tasks
        for(int i = 0; i < arr.length; i++){
            arr[i] = new Task(i, tasks[i][0], tasks[i][1]);
        }
        
        // sorting arr by enqueue Time
        Arrays.sort(arr, (a,b) -> {
            return Integer.compare(a.enqueueTime, b.enqueueTime);
        });
        
        // creating PQ and adding comparator such that it compares proTime,
        // if they are equal then it considers index
        PriorityQueue<Task> pq = new PriorityQueue<>((a,b) -> {
            if(a.processingTime == b.processingTime){
                return Integer.compare(a.idx, b.idx);
            }
            return Integer.compare(a.processingTime, b.processingTime);
        });
        
        // creating finalAnswer arr to be returned at the end
        int[] answer = new int[tasks.length];
        
        int ansIdx = 0;     // pointer that runs on answer[]
        int taskIdx = 0;     // pointer that runs on Tasks array
        int clock = 0;      // absolute time
        
        while(ansIdx < answer.length){
            while(taskIdx < tasks.length && arr[taskIdx].enqueueTime <= clock){
                pq.offer(arr[taskIdx]);
                taskIdx++;
            }
            if(pq.isEmpty()){
                clock = arr[taskIdx].enqueueTime;
            }else{
                clock += pq.peek().processingTime;
                answer[ansIdx++] = pq.poll().idx;
            }
        }
        return answer;
    }
    
    
    // creating a separate class of Task
    // adding one extra element as Index
    class Task{
        int idx;
        int enqueueTime;
        int processingTime;
        
        Task(int idx, int en, int pro){
            this.idx = idx;
            this.enqueueTime = en;
            this.processingTime = pro;
        }
    }
}