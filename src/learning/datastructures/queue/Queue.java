package learning.datastructures.queue;

import java.util.Arrays;

public class Queue {
    private int maxsize;
    private long[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int maxsize){
        this.maxsize = maxsize;
        queueArray = new long[maxsize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    @Override
    public String toString() {
        return "Queue { " +
                "maxsize=" + maxsize +
                ", queueArray=" + Arrays.toString(queueArray) +
                ", front=" + front +
                ", rear=" + rear +
                ", nItems=" + nItems +
                " }";
    }

    public void insert(int value){
        if(front == maxsize){
            front = 0;
        }
        queueArray[front] = value;
        front++;
        if(nItems != maxsize) nItems++;
    }

    public long remove(){
        rear++;
        long value;
        if (rear == front){
            System.out.println("Queue is Empty");
            return -1;
        } else {
            value = queueArray[rear];
            queueArray[rear] = 0;
            return value;
        }

    }
}
