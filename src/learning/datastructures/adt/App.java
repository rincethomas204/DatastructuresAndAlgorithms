package learning.datastructures.adt;

import java.util.LinkedList;

public class App {

    public static void main(String[] args){
        Counter myCounter = new Counter("Counter1");
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();

        System.out.println(myCounter);

        LinkedList<Integer> newLinkedlist = new LinkedList<Integer>();

    }
}
