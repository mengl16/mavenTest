package com.thread.basic;

public class StopThreadMathod2 extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("run begin");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("run begin");

    }
    public static void main(String[] args) {
        try {
            StopThreadMathod2 stopThread = new StopThreadMathod2();
            stopThread.start();
            Thread.sleep(200);
            stopThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
