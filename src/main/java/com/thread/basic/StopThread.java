package com.thread.basic;

public class StopThread extends Thread {
    @Override
    public void run() {
        super.run();
        for(int i=0;i<10000;i++){
            System.out.println("i="+i);
        }
    }

    public static void main(String[] args) {
       StopThread stopThread = new StopThread();
        stopThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stopThread.interrupt();
       /*  System.out.println("是否停止"+stopThread.interrupted());
        System.out.println("是否停止"+stopThread.interrupted());
        System.out.println("是否停止"+stopThread.interrupted());
        System.out.println("是否停止"+stopThread.interrupted());*/
//        Thread.currentThread().interrupt();
        /*System.out.println("是否停止"+Thread.interrupted());
        System.out.println("是否停止"+Thread.interrupted());*/
        System.out.println("是否停止"+stopThread.isInterrupted());
        System.out.println("是否停止"+stopThread.isInterrupted());
    }
}
