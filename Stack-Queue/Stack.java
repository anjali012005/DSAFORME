class Stack{
    int arr[] = new int[100];
    int pointer = -1;
    
    public void push(int x){
        pointer++;
        arr[pointer] = x;
    }

    public int pop(){
        int x = arr[pointer];
        pointer--;
        return x;
    }

    public int peek(){
        int x = arr[pointer];
        return x;
    }

    public int size(){
        return pointer+1;
    }

    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("Before popping : " + st.peek());
        st.pop();
        System.out.println("After popping : " +  st.peek());
        System.out.println("Stack size : " + st.size());
    }
}