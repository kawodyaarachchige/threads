package org.example;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread one = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("one");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread two = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Two");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        one.start();
        one.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Thread Priority :" + one.getPriority());

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        two.start();
        two.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Thread Priority :" + two.getPriority());

        one.join();
        two.join();


        System.out.println("Current Thread :"+ Thread.currentThread().getName());
    }
}