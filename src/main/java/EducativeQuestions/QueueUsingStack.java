package EducativeQuestions;

class QueueUsingStack<V> {

    Stack<V> enqStack;
    Stack<V> deqStack;
    public QueueUsingStack(int maxSize){
        // Write -- Your -- Code
        this.enqStack=new Stack(maxSize);
        this.deqStack=new Stack(maxSize);
    }
    public void enqueue(V value){
        // Write -- Your -- Code
        if(enqStack.isFull())
            return;

        enqStack.push(value);
    }
    public V dequeue(){
        // Write -- Your -- Code
        if(isEmpty())
            return null;

            if(deqStack.isEmpty())
            {
                while(!enqStack.isEmpty())
                {
                    deqStack.push(enqStack.pop());
                }
                return deqStack.pop();
            }
            else
            {
                 return deqStack.pop();
            }
        }
    public boolean isEmpty(){
        //Write -- Your -- Code
        return enqStack.isEmpty() && deqStack.isEmpty();
    }

    public static void main(String[] args) {

        QueueUsingStack<Integer> queue = new QueueUsingStack<>(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue()); //this will output null because queue will be empty
    }
}
