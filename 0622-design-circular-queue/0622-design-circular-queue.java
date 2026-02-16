class MyCircularQueue {

    int size;
    ArrayList<Integer> li = new ArrayList<>();

    public MyCircularQueue(int k) {
       this.size = k;
    }
    
    public boolean enQueue(int value) {
        if(li.size()<size){
            li.add(value);
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(li.size()!=0){
            li.remove(0);
            return true;
        }
        return false;
    }
    
    public int Front() {
        if(li.size()!=0){
            return li.get(0);
        }
        return -1;
    }
    
    public int Rear() {
        if(li.size()!=0){
            return li.get(li.size()-1);
        }
        return -1;
    }
    
    public boolean isEmpty() {
        return li.size()==0;
    }
    
    public boolean isFull() {
        return li.size()==size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */