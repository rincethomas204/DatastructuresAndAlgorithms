package learning.concurrent.threading;

public class Application {
    public static void main(String[] args){

        System.out.println("Starting Thread 1");
        Task taskRunner = new Task();
        taskRunner.start();

        System.out.println("Starting Thread 2");
        Task taskRunner2 = new Task();
        taskRunner2.start();


    }
}

class Task extends Thread{
    static char ref =64;

    @Override
    public void run() {
        ref ++;
        Thread.currentThread().setName("Thread-"+ref);
        for (int i=0; i < 1000; i++){
            System.out.println("Number "+ i + " - " + Thread.currentThread().getName() );
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
