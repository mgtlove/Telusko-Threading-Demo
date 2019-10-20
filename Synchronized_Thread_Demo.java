import java.util.*;

class SyncThread implements Runnable{
 
    @Override
    public void run(){
        try{
            System.out.println("Started Thread " + Thread.currentThread().getId());
            synchronized(this){
                for(int i = 0; i<10; i++){
                    
                        System.out.println("Thread " + Thread.currentThread().getId() + " Number: " + i);
                    }
                System.out.println("Thread " + Thread.currentThread().getId() + " Finished printing.");
                }  
        }catch(Exception e){
            e.getMessage();
        }
    }
}

class Synchronized_Thread_Demo{
    public static void main(String[] args) {
        int count = 5;
        SyncThread run = new SyncThread();
        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run);
        thread1.start();
        thread2.start();
    }
}