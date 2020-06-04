package com.thread.basic;

public class ThreadPriority1 extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("ThreadPriority1:priority="+this.getPriority());
    }
}
