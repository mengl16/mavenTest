package com.thread.basic;

public class UnShareDataThread extends Thread {
    private int count=100;
    public UnShareDataThread(String name){
        super();
        this.setName(name);
    }
    @Override
    synchronized  public void run() {
        while(count>0){
            count--;
            System.out.println("由"+Thread.currentThread().getName()+"计算"+count);
        }
    }

    public static void main(String[] args) {
        UnShareDataThread unShareDataThread =new UnShareDataThread("1");
        UnShareDataThread unShareDataThread1 =new UnShareDataThread("2");
        UnShareDataThread unShareDataThread2 =new UnShareDataThread("3");
     /*   unShareDataThread.start();
        unShareDataThread1.start();
        unShareDataThread2.start();*/
        Thread t =new Thread(unShareDataThread,"A");
        Thread t1 =new Thread(unShareDataThread,"B");
        Thread t2 =new Thread(unShareDataThread,"C");
        Thread t3 =new Thread(unShareDataThread,"D");
        Thread t4 =new Thread(unShareDataThread,"E");
        t.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
