package org.example;


class One implements Runnable{


    @Override
    public void run() {

    }
}
class Two implements Runnable{

    public void run() {

    }
}

public class Main {
    public static void main(String[] args) {

        Runnable obj1 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("one");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable obj2 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("one");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
    }
}