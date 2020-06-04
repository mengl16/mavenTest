package com.thread.basic;

public class SuspendAndResumeThread extends Thread {
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
        }
    }

    public static void main(String[] args) throws InterruptedException {
    SuspendAndResumeThread resumeThread = new SuspendAndResumeThread();
    resumeThread.start();
    Thread.sleep(5000);
    resumeThread.suspend();
    System.out.println("A="+System.currentTimeMillis()+"  i="+resumeThread.getI());
    Thread.sleep(5000);
    System.out.println("A="+System.currentTimeMillis()+"  i="+resumeThread.getI());
        Thread.sleep(5000);
    resumeThread.resume();
        Thread.sleep(5000);
        resumeThread.suspend();
        System.out.println("B="+System.currentTimeMillis()+" i="+resumeThread.getI());
        Thread.sleep(5000);
        System.out.println("B="+System.currentTimeMillis()+" i="+resumeThread.getI());


    }
}
