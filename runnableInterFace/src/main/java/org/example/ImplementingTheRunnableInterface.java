package org.example;

public class ImplementingTheRunnableInterface {
    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);

        thread.start();

    }
}