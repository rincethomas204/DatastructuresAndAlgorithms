package learning.datastructures.queue;

public class App {
    public static void main(String[] args){
        Queue newQueue = new Queue(9);
        newQueue.insert(10);
        newQueue.insert(22);
        newQueue.insert(34);
        newQueue.insert(94);
        newQueue.insert(94);
        newQueue.insert(94);


        System.out.println("removed: " + newQueue.remove());
        System.out.println("removed: " + newQueue.remove());
        System.out.println(newQueue);
    }
}
