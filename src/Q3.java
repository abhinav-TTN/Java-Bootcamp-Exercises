public class Q3 {
    int[] stack;
    int[] minStack;
    int stackTop = -1;
    int minTop = -1;
    int capacity = 10;
    int min = Integer.MAX_VALUE;

    public Q3() {
        stack = new int[capacity];
        minStack = new int[capacity];
    }

    public Q3(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        minStack = new int[capacity];
    }

    void push(int i) {
        if (!this.isFull()) {
            stack[++stackTop] = i;
        }
        if (i < minStack[minTop] && !this.minIsFull()) {
            minStack[++minTop] = i;
        }
    }

    int pop() throws Exception{
        int temp;
        if(!this.isEmpty()) {
            temp = stack[stackTop--];
        }
        else throw new Exception();
        if(!this.minIsEmpty() && minStack[minTop] == temp) {
            min = minStack[--minTop];
        }
        return temp;
    }

    int getMin() {
        return min;
    }

    boolean isEmpty() {
        return stackTop == -1;
    }

    boolean minIsEmpty() {
        return minTop == -1;
    }

    boolean isFull() {
        return stackTop == capacity;
    }

    boolean minIsFull() {
        return minTop == capacity;
    }

}
