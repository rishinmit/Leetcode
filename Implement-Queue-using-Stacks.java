class MyQueue {
        private int size;
        private int front;
        private int rear;
        private int arr[];

    public MyQueue() {
        this.size = 1000;
        arr = new int[size];
        front = 0;
        rear = -1;
    }
    
    public void push(int x) {
        if(rear==size-1){
            System.out.println("Queue full");
            return;
        }
        arr[++rear] = x;
    }
    
    public int pop() {
        if(empty()){
            return -1;
        }

        return arr[front++];
    }
    
    public int peek() {
        if(empty()){
            return -1;
        }
        return arr[front];
    }
    
    public boolean empty() {
        if(front>rear){
            return true;
        }
        return false;
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