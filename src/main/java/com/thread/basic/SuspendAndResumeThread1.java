package com.thread.basic;

public class SuspendAndResumeThread1 extends Thread {
    private long i=0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        super.run();
        while(true){
            i++;
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
    SuspendAndResumeThread1 resumeThread = new SuspendAndResumeThread1();
    resumeThread.start();
    Thread.sleep(5000);
    resumeThread.suspend();
        System.out.println("main end ");
        System.out.print("main end");


    }
}
