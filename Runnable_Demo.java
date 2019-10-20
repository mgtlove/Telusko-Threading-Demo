import java.util.*;

class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Started" + Thread.currentThread().getId());
        for(int i = 0; i<10; i++){
            System.out.println("Thread " + Thread.currentThread().getId() + " Number: " + i);
        }
        System.out.println("Thread " + Thread.currentThread().getId() + " Finished printing.");
    }
}

class Second implements Runnable{
    @Override
    public void run(){
        for(int i =0; i<10; i++)System.out.println("Hello");
    }
}

class Runnable_Demo{
    public static void main(String[] args) {
        MyRunnable run1 = new MyRunnable();
        Second run2 = new Second();
        //MyRunnable run2 = new MyRunnable();
        Thread thread1 = new Thread(run1);
        Thread thread2 = new Thread(run2);

        thread1.start();
        thread2.start();
        
    }
}