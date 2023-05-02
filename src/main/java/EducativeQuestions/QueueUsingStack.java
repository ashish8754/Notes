package EducativeQuestions;

class QueueUsingStack<V> {

    Stack<V> enqStack;
    Stack<V> deqStack;
    public QueueUsingStack(int maxSize){
        // Write -- Your -- Code
        this.enqStack=new Stack(maxSize);
        this.deqStack=new Stack(maxSize);
    }

    // public boolean isEmpty()
    // {
    //     return enqStack.isEmpty();
    // }

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

//        while(!enqStack.isEmpty())
//        {
//            deqStack.push(enqStack.pop());
//        }
//        int result=deqStack.pop();
//
//        while(!deqStack.isEmpty())
//        {
//            enqStack.push(deqStack.pop());
//        }
//        return result;

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
}
