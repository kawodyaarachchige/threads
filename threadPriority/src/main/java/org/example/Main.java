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
       // one.setName("Thread One");

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread Name :" + one.getName());

        two.start();
       // two.setName("Thread Two");

        one.join();
        two.join();

        System.out.println("Thread Name :" + two.getName());
        System.out.println("bye");
    }
}