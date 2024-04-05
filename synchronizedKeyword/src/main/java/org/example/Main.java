package org.example;

class Calculation{
    int num;
    public  synchronized void increment(){
        num++;

    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Calculation  cal = new Calculation();

        Thread one = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
               cal.increment();
            }
        });
        Thread two = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
               cal.increment();
            }
        });
        one.start();
        two.start();
        one.join();
        two.join();


        System.out.println("COUNT :" + cal.num);
    //If you declare any method as synchronized, it is known as synchronized method.
        //
        //Synchronized method is used to lock an object for any shared resource.
        //
        //When a thread invokes a synchronized method, it automatically acquires the lock for that object and releases it when the thread completes its task.


    }
}