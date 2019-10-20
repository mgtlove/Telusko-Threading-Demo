import java.util.*;

class MyThread extends Thread { 
    @Override
    public void run() { 
        try{ 
            // Displaying the thread that is running 
            for(int i = 0; i < 10; i++){System.out.println("Thread " + Thread.currentThread().getId() + " is running" +"Nums: " + i);
            }
            Thread.sleep(1000);
        } catch (Exception e) { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 

class Thread_Demo{
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            new MyThread().start();
        }     
    }
}