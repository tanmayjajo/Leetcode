class Node{
    int val;
    Node next;
    
    public Node(){
        this.val = 0;
        this.next = null;
    }
    public Node(int val){
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;
    Node tail;
    int size;
    
    
    
    public MyLinkedList() {
        this.head = null;
        this.tail = head;
        this.size = 0;
    }
    
    public int get(int index) {
        if(size <= index) return -1;
        
        Node temp = head;
        while(index-- > 0){
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        if(size == 0){
            head = new Node(val);
            tail = head;
            size++;
            
            return;
        }
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        size++;
        
    }
    
    public void addAtTail(int val) {
        if(size == 0){
            head = new Node(val);
            tail = head;
            size++;
            
            return;
        }
        Node temp = new Node(val);
        tail.next = temp;
        temp.next = null;
        tail = temp;
        size++;
        
    }
    
    public void addAtIndex(int index, int val) {
        if(size < index) return;
        
        if(index == 0){
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }
        
        Node temp = head;
        while(index-- > 1){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        if(temp.next.next == null) tail = temp.next;
    }
    
    
    
    public void deleteAtIndex(int index) {
        if(size <= index) return;
        
        // only node is being deleted
        if(size == 1){
            head = null;
            tail = null;
            size = 0;
            return;
        }
        
        // head node is being deleted
        if(index == 0){
            head = head.next;
            size--;
            return;
        }
        
        // all other cases
        Node temp = head;
        while(index-- > 1){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
        if(temp.next == null) tail = temp;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */