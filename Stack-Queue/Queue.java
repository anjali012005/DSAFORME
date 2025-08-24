class Queue {
    int arr[] = new int[100];
    int start = -1;
    int end = -1;
    int currSize = 0;

    public void push(int x){
        if(start == -1 && end == -1){
            start = 0;
            end = 0;
        } else {
            end = end % arr.length;
        }
        arr[end] = x;
        currSize++;
    }
    
    public int pop(){
        if(currSize == 0){
            return -1; // queue empty
        }
        int x = arr[start];
        start= start % arr.length;
        currSize--;
        return x;
    }

    public int peek(){
        if(currSize == 0){
            return -1;
        }
        return arr[start];
    }

    public int size(){
        return currSize;
    }

    public static void main(String args[]){
        Queue  myq = new Queue();

        myq.push(1);
        myq.push(3);
        myq.push(4);
        System.out.println("Queue Peek : " + myq.peek());
    }
}
