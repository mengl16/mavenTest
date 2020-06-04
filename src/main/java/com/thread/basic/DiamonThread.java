package com.thread.basic;

public class DiamonThread extends Thread {
    @Override

    public void run() {
        super.run();
        int i = 0;
        while (true) {
            i++;
            System.out.println("i=" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        DiamonThread diamonThread = new DiamonThread();
        diamonThread.setDaemon(true);
        diamonThread.start();
        Thread.sleep(5000);
        System.out.println("我结束了，守护线程跟着也结束");
    }
}
