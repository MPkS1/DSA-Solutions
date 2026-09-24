class myStack {
    int[] arr;
    int top;

    public myStack(int n) {
        arr=new int[n];
        top=-1;
    }

    public boolean isEmpty() {
        return top==-1;
    }

    public boolean isFull() {
        return top==arr.length-1;
    }

    public void push(int x) {
        if(isFull())
            return;
        arr[++top]=x;
    }

    public void pop() {
        if(isEmpty())
            return;
        top--;
    }

    public int peek() {
        if(isEmpty())
            return -1;
        return arr[top];
    }
}