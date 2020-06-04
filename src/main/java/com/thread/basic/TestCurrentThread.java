package com.thread.basic;

public class TestCurrentThread  extends Thread{
    public TestCurrentThread(){
        System.out.println("TestCurrentThread start");
        System.out.println("ThreadName= "+Thread.currentThread().getName());
        System.out.println("Thread  is alive "+Thread.currentThread().isAlive());
        System.out.println("this.name=" + this.getName());
        System.out.println("this.alive=" + this.isAlive());
        System.out.println("TestCurrentThread end");
}

    @Override
    public void run() {
        super.run();
        System.out.println("run start");
        System.out.println("rumThreadName= "+Thread.currentThread().getName());
        System.out.println("rumThread is alive"+Thread.currentThread().isAlive());
        System.out.println("this.name=" + this.getName());
        System.out.println("this isalive=" + this.isAlive());
        System.out.println("run end");
    }

    public static void main(String[] args) {
        TestCurrentThread t= new TestCurrentThread();
        Thread t1=new Thread(t);
        t1.setName("A");
        t1.start();
        System.out.println("ThreadName= "+Thread.currentThread().getName());
//        t.run();
    }
}
