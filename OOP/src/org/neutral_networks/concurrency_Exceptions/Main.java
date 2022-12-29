package org.neutral_networks.concurrency_Exceptions;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //System.out.println("Hello from another thread");
                // worker thread
                for(int i=0; i<5; i++) {
                    System.out.println("Printing " + i + " in a worker thread.");
                    //Thread.sleep(1000);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException err) {
                        err.printStackTrace();
                    }
                }
            }
        });
        // main thread
        thread.start();

        for(int i=0; i<5; i++) {
            System.out.println("Printing " + i + " in main thread.");
            //Thread.sleep(1000);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException err) {
                err.printStackTrace();
            }
        }
    }
}
