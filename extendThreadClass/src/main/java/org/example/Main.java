package org.example;



class One extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("One");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Two extends Thread{
    public void run(){

        for(int i=1;i<=5;i++){
            System.out.println("Two");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        One one = new One();
        Two two = new Two();

        one.start();
        Thread.sleep(10);
        two.start();




        }
    }
